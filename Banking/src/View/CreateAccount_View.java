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
    private JTextField houseNoField;
    private JTextField soiField;
    private JTextField roadField;
    private JTextField subDistrictField;
    private JTextField districtField;
    private JTextField provinceField;
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
        
        JLabel houseNoLable = new JLabel("House No. :");
	houseNoLable.setBounds(40, 280, 80, 30);
	getContentPane().add(houseNoLable);
        
        houseNoField = new JTextField("");
	houseNoField.setBounds(150, 280, 160, 30);
	getContentPane().add(houseNoField);
        
        JLabel soiLable = new JLabel("Soi. :");
	soiLable.setBounds(40, 320, 80, 30);
	getContentPane().add(soiLable);
        
        soiField = new JTextField("");
	soiField.setBounds(150, 320, 160, 30);
	getContentPane().add(soiField);
        
        JLabel roadLable = new JLabel("Road :");
	roadLable.setBounds(40, 360, 80, 30);
	getContentPane().add(roadLable);
        
        roadField = new JTextField("");
	roadField.setBounds(150, 360, 160, 30);
	getContentPane().add(roadField);
        
        JLabel subDistrictLable = new JLabel("Sub-district :");
	subDistrictLable.setBounds(40, 400, 80, 30);
	getContentPane().add(subDistrictLable);
        
        subDistrictField = new JTextField("");
	subDistrictField.setBounds(150, 400, 160, 30);
	getContentPane().add(subDistrictField);
        
        JLabel districtLable = new JLabel("District :");
	districtLable.setBounds(40, 440, 80, 30);
	getContentPane().add(districtLable);
        
        districtField = new JTextField("");
	districtField.setBounds(150, 440, 160, 30);
	getContentPane().add(districtField);
        
        JLabel provinceLable = new JLabel("Province :");
	provinceLable.setBounds(40, 480, 80, 30);
	getContentPane().add(provinceLable);
        
        provinceField = new JTextField("");
	provinceField.setBounds(150, 480, 160, 30);
	getContentPane().add(provinceField);
    }         
    //Button    
    public void createButton(){
        createButton = new JButton("Create");
        createButton.setBounds(200, 550, 100, 30);
	getContentPane().add(createButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(400, 550, 100, 30);
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
    public String getHouseNo(){
        String houseNo = houseNoField.getText();
        return houseNo;
    }
    public String getSoi(){
        String soi = soiField.getText();
        return soi;
    }
    public String getRoad(){
        String road = roadField.getText();
        return road;
    }
    public String getSubDistrict(){
        String subDistrict  = subDistrictField .getText();
        return subDistrict;
    }
    public String getDistrict(){
        String district  = districtField.getText();
        return district;
    }
    public String getProvince(){
        String  province =  provinceField.getText();
        return  province;
    }
    
    public void setActionCreateButton(ActionListener action){
        createButton.addActionListener(action);
    }
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
}
