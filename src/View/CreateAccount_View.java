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
    
    private JTextField usernameField;
    private JTextField passwordField;
    private JTextField houseNoField;
    private JTextField soiField;
    private JTextField roadField;
    private JTextField subDistrictField;
    private JTextField districtField;
    private JTextField dateField;
    
    public static void main(String args[]){
        
    }
    
    public CreateAccount_View(){
        inComponent2();
    }
    
    private void inComponent2(){
        
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 20, 80, 30);
	getContentPane().add(usernameLable);
        
        usernameField = new JTextField("");
	usernameField.setBounds(40, 50, 160, 30);
	getContentPane().add(usernameField);
        
        JLabel passwordLable = new JLabel("Password :");
	passwordLable.setBounds(40, 90, 80, 30);
	getContentPane().add(passwordLable);
        
        passwordField = new JTextField("");
	passwordField.setBounds(40, 120, 160, 30);
	getContentPane().add(passwordField);
        
        JLabel houseNoLable = new JLabel("House No.:");
	houseNoLable.setBounds(40, 180, 80, 30);
	getContentPane().add(houseNoLable);
        
        houseNoField = new JTextField("");
	houseNoField.setBounds(40, 210, 160, 30);
	getContentPane().add(houseNoField);
        
        JLabel soiLable = new JLabel("Soi:");
	soiLable.setBounds(40, 240, 80, 30);
	getContentPane().add(soiLable);
        
        soiField = new JTextField("");
	soiField.setBounds(40, 280, 160, 30);
	getContentPane().add(soiField);
        
        JLabel roadLable = new JLabel("Road:");
	roadLable.setBounds(40, 310, 80, 30);
	getContentPane().add(roadLable);
        
        roadField = new JTextField("");
	roadField.setBounds(40, 340, 160, 30);
	getContentPane().add(roadField);
        
        JLabel subDistrictLable = new JLabel("Sub-District:");
	subDistrictLable.setBounds(40, 370, 80, 30);
	getContentPane().add(subDistrictLable);
        
        subDistrictField = new JTextField("");
	subDistrictField.setBounds(40, 400, 160, 30);
	getContentPane().add(subDistrictField);
        
        JLabel districtLable = new JLabel("District:");
	districtLable.setBounds(40, 430, 80, 30);
	getContentPane().add(districtLable);
        
        districtField = new JTextField("");
	districtField.setBounds(40, 460, 160, 30);
	getContentPane().add(districtField);
        
        JLabel provinceLable = new JLabel("Province:");
	provinceLable.setBounds(40, 490, 80, 30);
	getContentPane().add(provinceLable);
        
        subDistrictField = new JTextField("");
	subDistrictField.setBounds(40, 520, 160, 30);
	getContentPane().add(subDistrictField);
        
        JLabel dateLable = new JLabel("Date:");
	dateLable.setBounds(40, 550, 80, 30);
	getContentPane().add(dateLable);
        
        dateField = new JTextField("");
	dateField.setBounds(40, 550, 160, 30);
	getContentPane().add(dateField);
        
        JButton createButton = new JButton("Create");
        createButton.setBounds(80, 580, 70, 30);
	getContentPane().add(createButton);
    }
}
