/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.code.reelcash.util;

import com.google.code.reelcash.Log;
import java.awt.BorderLayout;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 * This class provides wrapper methods for quick access to Jasper Report
 * functionalities.
 * @author cusi
 */
public final class ReportingUtils {

    private static final String invoiceReportUrl = "/com/google/code/reelcash/reports/report2.jrxml";
    private static final String invoiceSub1Url = "/com/google/code/reelcash/reports/report2_subreport1.jrxml";
    private static final String invoiceSub2Url = "/com/google/code/reelcash/reports/report2_subreport2.jrxml";
    private static final String reportsDir;

    static {
        StringBuilder builder = new StringBuilder(SysUtils.getAppHome());
        builder.append("reports");
        builder.append(SysUtils.getFileSeparator());
        reportsDir = builder.toString();
        File f = new File(reportsDir);
        if (!f.exists()) {
            f.mkdir();
        }
    }

    private static String getReportPath(String reportName) {
        return reportsDir.concat(SysUtils.getFileSeparator()).concat(reportName);
    }

    private static boolean reportExists(String reportName) {
        File f = new File(getReportPath(reportName));
        return f.exists() && f.isFile();
    }

    private static boolean compileReport(String srcPath, String reportName) {
        if (!reportExists(reportName)) {
            FileOutputStream fos = null;
            try {
                InputStream is = ReportingUtils.class.getResourceAsStream(srcPath);
                fos = new FileOutputStream(getReportPath(reportName));
                JasperCompileManager.compileReportToStream(is, fos);
                return true;
            } catch (JRException ex) {
                Log.write().log(Level.WARNING, "Compile report error", ex);
            } catch (Throwable t) {
                Log.write().log(Level.SEVERE, "Compile report error", t);
            } finally {
                if (null != fos) {
                    try {
                        fos.close();
                    } catch (Throwable t) {
                        Log.write().log(Level.SEVERE, "Report save error", t);
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean compileReports() {
        if (!compileReport(invoiceReportUrl, "report2.jasper")) {
            return false;
        }
        if (!compileReport(invoiceSub1Url, "report2_subreport1.jasper")) {
            return false;
        }
        if (!compileReport(invoiceSub2Url, "report2_subreport2.jasper")) {
            return false;
        }
        return true;
    }

    public static JasperReport loadReport(String reportName) {
        try {
            return (JasperReport) JRLoader.loadObject(getReportPath(reportName));

        } catch (JRException ex) {
            Log.write().log(Level.SEVERE, "Can't load report", ex);
            return null;
        }
    }

    public static JasperPrint fillInvoice(JasperReport report, int invoiceId, Connection connection) {
        try {
            HashMap map = new HashMap();
            map.put("INVOICEID", invoiceId);
            map.put("SUBREPORT_DIR", reportsDir);
            File f = new File(getReportPath("report2.jasper"));
            return JasperFillManager.fillReport(f.getPath(), map, connection);
        } catch (JRException ex) {
            Log.write().log(Level.SEVERE, "Fill ended up pretty badly", ex);
        }
        return null;
    }

    public static void showPreview(JasperPrint print) {
        try {
            JDialog dlg = new JDialog((Window) null, "Preview invoice", ModalityType.APPLICATION_MODAL);
            Dimension maxSize = Toolkit.getDefaultToolkit().getScreenSize();
            dlg.setMinimumSize(new Dimension((int) maxSize.getWidth() / 2,
                    (int) maxSize.getHeight() / 2));
            dlg.setMaximumSize(maxSize);
            dlg.setPreferredSize(new Dimension(
                    (int) (maxSize.getWidth() + dlg.getMinimumSize().getWidth()) / 2,
                    (int) (maxSize.getHeight() + dlg.getMinimumSize().getHeight()) / 2));
            dlg.setLocation(new Point(
                    (int) (maxSize.getWidth() - dlg.getPreferredSize().getWidth()) / 2,
                    (int) (maxSize.getHeight() - dlg.getPreferredSize().getHeight()) / 2));
            dlg.setLayout(new BorderLayout());
            JRViewer view = new JRViewer(print);
            dlg.add(view, BorderLayout.CENTER);
            dlg.setVisible(true);
        } catch (Throwable t) {
            Log.write().log(Level.SEVERE, "Can't show preview", t);
        }
    }
}
