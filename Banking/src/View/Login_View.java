/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.ActionListener;
import javafx.scene.control.PasswordField;
import javax.swing.*;

/**
 *
 * @author Kango_000
 */

public class Login_View extends JFrame
{
   
   //private JLabel usernameLabel;
    private JTextField usernameField;
   // private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccButton;
    
    
    public Login_View(){
        makeFrame();
        inComponent();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(244, 349));
	setTitle("Log in");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 20, 80, 30);
	getContentPane().add(usernameLable);
        
        usernameField = new JTextField("");
	usernameField.setBounds(40, 50, 160, 30);
	getContentPane().add(usernameField);
        
        JLabel passwordLable = new JLabel("Password :");
	passwordLable.setBounds(40, 90, 80, 30);
	getContentPane().add(passwordLable);
        
        passwordField = new JPasswordField("");
	passwordField.setBounds(40, 120, 160, 30);
	getContentPane().add(passwordField);
        
        loginButton = new JButton("login");
        loginButton.setBounds(80, 170, 70, 30);
	getContentPane().add(loginButton);
        
        //add new create account button
        createAccButton = new JButton("Create Account");
        createAccButton.setBounds(80, 200, 140, 30);
	getContentPane().add(createAccButton);
    }
    
    public String getUername(){
        String userName = usernameField.getText();
        return userName;
    }
    
    public String getPassword(){
        String password = passwordField.getText();
        return password;
    }
    
    public void setActionLoginButton(ActionListener action){
        loginButton.addActionListener(action);
    }
    
    public void setActionCreateAccButton(ActionListener action){
        createAccButton.addActionListener(action);
    }
     
}                 
    
