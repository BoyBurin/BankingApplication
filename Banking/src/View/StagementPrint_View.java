/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_View extends JFrame {
    
    private JButton printButton;
    
    public StagementPrint_View(){
        makeFrame();
        inComponent();
        
    }
    
    public static void main (String [] args){
        new StagementPrint_View().setVisible(true);
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Interest Rate Calculator");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        
    }
    
    public void button(){
        printButton = new JButton("Print");
        printButton.setBounds(80, 170, 70, 30);
	getContentPane().add(printButton);
        
    }
    
    /*public String getUername(){
        String userName = usernameField.getText();
        return userName;
    }
    
    public String getPassword(){
        String password = passwordField.getText();
        return password;
    }*/
    
    public void setActionPrintButton(ActionListener action){
        printButton.addActionListener(action);
    }
    
    
}
