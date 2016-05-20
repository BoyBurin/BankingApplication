/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Kango_000
 */
public class CreateAccount_View extends JFrame {
    
    private JTextField nameField;
    private JTextField middleNameField;
    private JTextField surnameField;
    private JTextField usernameField;
    private JTextField passwordField;
    private JTextField dateField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField addressLine1Field;
    private JTextField addressLine2Field;
    private JTextField provinceField;
    private JTextField zipCodeField;
    private JButton createButton;
    private JButton homeButton;
       
    
    public static void main(String args[]){
        new CreateAccount_View().setVisible(true);
    }
    
    public CreateAccount_View(){
        inComponent();
        makeFrame();
        createButton();
    }
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Create Account");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel nameLable = new JLabel("Name :");
	nameLable.setBounds(40, 40, 80, 30);
	getContentPane().add(nameLable);
        
        nameField = new JTextField("");
	nameField.setBounds(150, 40, 100, 30);
	getContentPane().add(nameField);
                
        middleNameField = new JTextField("");
	middleNameField.setBounds(250, 40, 100, 30);
	getContentPane().add(middleNameField);
        
        surnameField = new JTextField("");
	surnameField.setBounds(350, 40, 100, 30);
	getContentPane().add(surnameField);
        
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 80, 80, 30);
	getContentPane().add(usernameLable);
        
        usernameField = new JTextField("");
	usernameField.setBounds(150, 80, 160, 30);
	getContentPane().add(usernameField);
        
        JLabel passwordLable = new JLabel("Password :");
	passwordLable.setBounds(40, 120, 80, 30);
	getContentPane().add(passwordLable);
        
        passwordField = new JTextField("");
	passwordField.setBounds(150, 120, 160, 30);
	getContentPane().add(passwordField);
        
        JLabel dateLable = new JLabel("Date :");
	dateLable.setBounds(40, 160, 80, 30);
	getContentPane().add(dateLable);
        
        dateField = new JTextField("");
	dateField.setBounds(150, 160, 160, 30);
	getContentPane().add(dateField);
        
        JLabel emailLable = new JLabel("Email :");
	emailLable.setBounds(40, 200, 80, 30);
	getContentPane().add(emailLable);
        
        emailField = new JTextField("");
	emailField.setBounds(150, 200, 160, 30);
	getContentPane().add(emailField);
        
        JLabel phoneLable = new JLabel("Phone :");
	phoneLable.setBounds(40, 240, 80, 30);
	getContentPane().add(phoneLable);
        
        phoneField = new JTextField("");
	phoneField.setBounds(150, 240, 160, 30);
	getContentPane().add(phoneField);
        
        JLabel addressLine1Lable = new JLabel("addressLine1 :");
	addressLine1Lable.setBounds(40, 280, 100, 30);
	getContentPane().add(addressLine1Lable);
        
        addressLine1Field = new JTextField("");
	addressLine1Field.setBounds(150, 280, 300, 30);
	getContentPane().add(addressLine1Field);
        
        JLabel addressLine2Lable = new JLabel("addressLine2 :");
	addressLine2Lable.setBounds(40, 320, 100, 30);
	getContentPane().add(addressLine2Lable);
        
        addressLine2Field = new JTextField("");
	addressLine2Field.setBounds(150, 320, 300, 30);
	getContentPane().add(addressLine2Field);
        
        JLabel provinceLable = new JLabel("province :");
	provinceLable.setBounds(40, 360, 80, 30);
	getContentPane().add(provinceLable);
        
        provinceField = new JTextField("");
	provinceField.setBounds(150, 360, 160, 30);
	getContentPane().add(provinceField);
        
        JLabel zipCodeLable = new JLabel("ZIP Code :");
	zipCodeLable.setBounds(40, 400, 80, 30);
	getContentPane().add(zipCodeLable);
        
        zipCodeField = new JTextField("");
	zipCodeField.setBounds(150, 400, 160, 30);
	getContentPane().add(zipCodeField);
        
        JFrame background = new JFrame();
        background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
    }       
    
    //Button    
    public void createButton(){
        createButton = new JButton("Create");
        createButton.setBounds(200, 460, 100, 30);
	getContentPane().add(createButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(400, 460, 100, 30);
	getContentPane().add(homeButton);
    }
    public void setActionCreateAccButton(ActionListener action){
        createButton.addActionListener(action);
    }
    
    public String getName(){
        String name = nameField.getText();
        return name;
    }
    public String getMiddleName(){
        String middleName = middleNameField.getText();
        return middleName;
    }
    public String getSurname(){
        String surname = surnameField.getText();
        return surname;
    }
    public String getUername(){
        String userName = usernameField.getText();
        return userName;
    }
    public String getPassword(){
        String password = passwordField.getText();
        return password;
    }
    public String getDate(){
        String date = dateField.getText();
        return date;
    }
    public String getEmail(){
        String email = emailField.getText();
        return email;
    }
    public String getPhone(){
        String phone = phoneField.getText();
        return phone;
    }
    public String getAddressLine1(){
        String addressLine1 = addressLine1Field.getText();
        return addressLine1;
    }
    public String getAddressLine2(){
        String addressLine2 = addressLine2Field.getText();
        return addressLine2;
    }
    public String getProvince(){
        String  province =  provinceField.getText();
        return  province;
    }
    public String getZipCode(){
        String  zipCode =  zipCodeField.getText();
        return  zipCode;
    }
    
    public void setActionCreateButton(ActionListener action){
        createButton.addActionListener(action);
    }
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
}
