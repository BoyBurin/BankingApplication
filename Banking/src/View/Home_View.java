/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kango_000
 */
public class Home_View extends JFrame {
    
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferButton;
    private JButton interestButton;
    private JButton stagementPrintOutButton;
    private JButton logoutButton;
    
    public static void main (String [] args){
        new Home_View().setVisible(true);
    }
    
    public Home_View(){
        makeFrame();
        button();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Bank Application");
	getContentPane().setLayout(null);
    }
    
    private void button(){
        depositButton = new JButton("Deposit");
        depositButton.setBounds(0, 0, 350, 200);
	getContentPane().add(depositButton);
        
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(0, 200, 350, 200);
	getContentPane().add(withdrawButton);
        
        transferButton = new JButton("Transfer");
        transferButton.setBounds(0, 400, 350, 200);
	getContentPane().add(transferButton);
        
        interestButton = new JButton("Interast");
        interestButton.setBounds(350, 0, 350, 200);
	getContentPane().add(interestButton);
        
        stagementPrintOutButton = new JButton("Stagement Print");
        stagementPrintOutButton.setBounds(350, 200, 350, 200);
	getContentPane().add(stagementPrintOutButton);
        
        logoutButton = new JButton("Log-out");
        logoutButton.setBounds(350, 400, 350, 200);
	getContentPane().add(logoutButton);
    }
}
