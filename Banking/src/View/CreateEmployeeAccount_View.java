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
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kango_000
 */
public class CreateEmployeeAccount_View extends JFrame {
    
    private JButton homeButton;
    private JButton changPasswordButton;
    private JLabel nameLabel;
    private JLabel middlenameLabel; 
    private JLabel surnameLabel; 
    private JLabel usernameLabel;
    private JLabel employeeID;
        
    public static void main(String[]args){
        new CreateEmployeeAccount_View().setVisible(true);
    }
    
    public CreateEmployeeAccount_View(){
        makeFrame();
        inComponent();
        Button();
    }
    
    public void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 500));
	setTitle("Employee Account");
	getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void inComponent(){
        JLabel employeeNoLable = new JLabel("Employee No. :");
	employeeNoLable.setBounds(40, 40, 100, 30);
	getContentPane().add(employeeNoLable);
        employeeID = new JLabel();
        employeeID.setBounds(140, 40, 100, 30);
        getContentPane().add(employeeID);
                      
        JLabel nameLable = new JLabel("Name :");
	nameLable.setBounds(40, 80, 80, 30);
	getContentPane().add(nameLable);
        nameLabel = new JLabel();
        nameLabel.setBounds(140, 80, 80, 30);
        getContentPane().add(nameLabel);
        
        JLabel middleNameLable = new JLabel("Middle Name :");
	middleNameLable.setBounds(40, 120, 80, 30);
	getContentPane().add(middleNameLable);
        middlenameLabel = new JLabel("");
        middlenameLabel.setBounds(140, 120, 80, 30);
        getContentPane().add(middlenameLabel);
        
        JLabel surnameLable = new JLabel("Surname :");
	surnameLable.setBounds(40, 160, 80, 30);
	getContentPane().add(surnameLable);
        surnameLabel = new JLabel("");
        surnameLabel.setBounds(140, 160, 80, 30);
        getContentPane().add(surnameLabel);
        
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 200, 80, 30);
	getContentPane().add(usernameLable);
        usernameLabel = new JLabel("");
        usernameLabel.setBounds(140, 200, 80, 30);
        getContentPane().add(usernameLabel);
        
        
        JFrame background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
    }
    
    public void Button(){
        changPasswordButton = new JButton("chang Password");
        changPasswordButton.setBounds(150, 350, 150, 30);
	getContentPane().add(changPasswordButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(400, 350, 100, 30);
	getContentPane().add(homeButton);
    }
    
    public void setActionChangPasswordButton(ActionListener action){
        changPasswordButton.addActionListener(action);
    }
    
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
    
    public void setIDLebel(String id){
        employeeID.setText(id);
    }
    public void setnameLebel(String name){
        nameLabel.setText(name);
    }
    public void setMiddlenameLebel(String middlename){
        middlenameLabel.setText(middlename);
    }
    public void setSurnameLebel(String surname){
        surnameLabel.setText(surname);
    }
    public void setUsernameLebel(String username){
        usernameLabel.setText(username);
    }
    
}
