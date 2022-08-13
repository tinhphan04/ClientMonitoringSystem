/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientmonitoringsystem;

import java.io.*;
import java.net.Socket;
import javax.swing.JFrame;

/**
 *
 * @author tinh.pv
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        CreateAndShowGUI();
    }
    
    private static void CreateAndShowGUI()
    {
        JFrame clientFrame = new JFrame("ClientForm");
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClientGUI clientGUI = new ClientGUI();
        clientFrame.setContentPane(clientGUI.getRootPane());
        clientFrame.pack();
        clientFrame.setVisible(true);
    }
}

