package ro.samlex.reelcash;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import ro.samlex.reelcash.data.Party;
import ro.samlex.reelcash.io.FileInputSource;
import ro.samlex.reelcash.ui.ApplicationMessages;
import ro.samlex.reelcash.ui.MainWindow;
import ro.samlex.reelcash.ui.welcome.JWelcomeDialog;

public class Application {

    private static final Application APPLICATION_INSTANCE;
    private Party company;

    public static void showMainFrame() {
        try {
        MainWindow window = new MainWindow();
        window.pack();
        window.setLocationByPlatform(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        } catch (IOException e) {
            ApplicationMessages.showError(null, "Apparently we couldn't find our app's icon :-(. " + e.getMessage());
        }
    }

    private static void showWelcomeDialog() {
        JDialog welcomeDialog = new JWelcomeDialog(null, true);
        welcomeDialog.pack();
        welcomeDialog.setLocationByPlatform(true);
        welcomeDialog.setLocationRelativeTo(null);
        welcomeDialog.setVisible(true);
    }

    static {
        APPLICATION_INSTANCE = new Application();
    }

    public static Application getInstance() {
        return APPLICATION_INSTANCE;
    }

    public static void main(String[] arguments) {
        if (APPLICATION_INSTANCE.loadCompanyData()) {
            showMainFrame();
            return;
        }
        showWelcomeDialog();
    }

    public Party getCompany() {
        return company;
    }

    public void setCompany(Party company) {
        this.company = company;
    }

    private boolean loadCompanyData() {
        try {
            Path companyDataFilePath = FileSystems.getDefault().getPath(
                    SysUtils.ensureDirs(SysUtils.getDbFolderPath()).toString(),
                    Reelcash.COMPANY_DATA_FILE_NAME);
            if (!Files.exists(companyDataFilePath)) {
                return false;
            }
            try (final Reader companyDataReader = new FileInputSource(companyDataFilePath).newReader()) {
                company = new Gson().fromJson(companyDataReader, Party.class);
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
