/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientmonitoringsystem;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author tinh.pv
 */
public class Server { //ClientMonitoringSystem

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        createAndShowGUI();
    }

 
    private static void createAndShowGUI() throws IOException {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Mainform");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(100,100);
        //Create and set up the content pane.
        MainForm demo = new MainForm();
        //frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.getRootPane());
        //QLHSPanel(frame.getContentPane());
        //Display the window.
        //frame.setSize(450, 260);
        frame.pack();
        frame.setVisible(true);
    }
}
