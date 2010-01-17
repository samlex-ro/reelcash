/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.reelcash;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 * <p>Class responsible for providing the point of entry in the application.</p>
 * 
 * @author andrei.olar
 */
public class EntryPoint {

    /**
	 * Entry point in the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        Class.forName("org.sqlite.JDBC");
			MainFrame frm = new MainFrame();
			frm.pack();
			frm.setVisible(true);
		}
		catch(Throwable t) {
			Logger.getAnonymousLogger().log(Level.SEVERE, "Uncaught exception", t);
		}
    }

}