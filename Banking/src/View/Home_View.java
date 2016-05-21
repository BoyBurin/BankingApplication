/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
    private JButton createCustomerButton;
    
    public static void main (String [] args){
        new Home_View();
    }
    
    public Home_View(){
        makeFrame();
        button();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 800));
	setTitle("Bank Application");
	setLayout(null);
        setVisible(true);
        
        /*JFrame background = new JFrame();
        background = new JFrame();*/
        Color c = new Color(161,217,195); 
        setBackground(c);
    }
    
    private void button(){
        depositButton = new JButton("Deposit");
        depositButton.setBounds(0, 0, 350, 200);
	add(depositButton);
        
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(0, 200, 350, 200);
	add(withdrawButton);
        
        transferButton = new JButton("Transfer");
        transferButton.setBounds(0, 400, 350, 200);
	add(transferButton);
        
        interestButton = new JButton("Interast");
        interestButton.setBounds(350, 0, 350, 200);
	add(interestButton);
        
        stagementPrintOutButton = new JButton("Print Stagement");
        stagementPrintOutButton.setBounds(350, 200, 350, 200);
	add(stagementPrintOutButton);
        
        createCustomerButton = new JButton("Create Customer");
        createCustomerButton.setBounds(350, 400, 350, 200);
	add(createCustomerButton);
        
        logoutButton = new JButton("Log-out");
        logoutButton.setBounds(0, 600, 350, 200);
	add(logoutButton);
        setR
    }
    
    public void setActionDepositButton(ActionListener action){
        depositButton.addActionListener(action);
    }
    public void setActionWithdrawButton(ActionListener action){
        withdrawButton.addActionListener(action);
    }
    public void setActionTransferButton(ActionListener action){
        transferButton.addActionListener(action);
    }
    public void setActionInterestButton(ActionListener action){
        interestButton.addActionListener(action);
    }
    public void setActionStagementPrintOutButton(ActionListener action){
        stagementPrintOutButton.addActionListener(action);
    }
    public void setActionLogOutButton(ActionListener action){
        logoutButton.addActionListener(action);
    }
}
