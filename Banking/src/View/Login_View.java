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
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton createAccButton;
    private ImageIcon image;      
    private JLabel jLabel1;
    
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
        setVisible(true);
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
        button();
        
        JFrame background = new JFrame();
        background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
        
        /*image = new ImageIcon(getClass().getResource("icon1.png"));
        //image.setBounds(40, 90, 80, 30);
        JLabel label = new JLabel(image);
        getContentPane().add(label);
        
        //jLabel1.setIcon(new ImageIcon(getClass().getResource("/Image/icon1.png"))); 
        /*jLabel1.setIcon(new ImageIcon(getClass().getResource("D:\\icon1.png"))); 
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 30, 20);*/
        
        
    }
      
    public void button(){
        loginButton = new JButton("login");
        loginButton.setBounds(80, 170, 70, 30);
	getContentPane().add(loginButton);
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
    public static void main(String[]args){
        new Login_View();
    } 
}                 
    
