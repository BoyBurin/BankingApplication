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
public class CreateAccount_View extends JFrame {
    
    public static void main(String args[]){
        
    }
    
    public CreateAccount_View(){
        inComponent2();
    }
    
    private void inComponent2(){
        
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
        
        JLabel confirmPassLable = new JLabel("Confiem Password :");
	passwordLable.setBounds(40, 180, 80, 30);
	getContentPane().add(confirmPassLable);
        
        JTextField confirmPassField = new JTextField("");
	confirmPassField.setBounds(40, 210, 160, 30);
	getContentPane().add(confirmPassField);
        
        JButton createButton = new JButton("Create");
        createButton.setBounds(80, 240, 70, 30);
	getContentPane().add(createButton);
    }
}
