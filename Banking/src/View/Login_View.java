/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Kango_000
 */

public class Login_View extends JFrame
{
   
   //private JLabel usernameLabel;
   // private JTextField usernameTextField;
   // private JLabel passwordLabel;
   // private JPasswordField passwordTextField;
   // private JButton loginButton;
    
    public static void main (String [] args){
       
       
    } 
    
    public Login_View(){
        makeFrame();
        inComponent();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
	setTitle("Log in");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 20, 80, 30);
	getContentPane().add(usernameLable);
        
        JTextField usernameField = new JTextField("");
	usernameField.setBounds(40, 50, 160, 30);
	getContentPane().add(usernameField);
        
        JLabel passwordLable = new JLabel("Password :");
	passwordLable.setBounds(40, 90, 80, 30);
	getContentPane().add(passwordLable);
        
        JTextField passwordField = new JTextField("");
	passwordField.setBounds(40, 120, 160, 30);
	getContentPane().add(passwordField);
        
        JButton loginButton = new JButton("login");
        loginButton.setBounds(80, 170, 70, 30);
	getContentPane().add(loginButton);
        
        //add new create account button
        JButton createAccButton = new JButton("Create Account");
        createAccButton.setBounds(80, 200, 70, 30);
	getContentPane().add(createAccButton);
    }
     
}                 
    
