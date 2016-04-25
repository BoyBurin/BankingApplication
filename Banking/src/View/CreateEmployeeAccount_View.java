/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kango_000
 */
public class CreateEmployeeAccount_View extends JFrame {
    
    private JTextField employeeNoField;
    private JTextField employeeNameField;
    private JButton backButton;
    
    public static void main(String[]args){
        new CreateEmployeeAccount_View().setVisible(true);
    }
    
    public CreateEmployeeAccount_View(){
        makeFrame();
        inComponent();
        backButton();
    }
    
    public void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 500));
	setTitle("Employee Account");
	getContentPane().setLayout(null);
    }
    
    public void inComponent(){
        JLabel employeeNoLable = new JLabel("Employee No. :");
	employeeNoLable.setBounds(40, 40, 100, 30);
	getContentPane().add(employeeNoLable);
                      
        JLabel nameLable = new JLabel("Name :");
	nameLable.setBounds(40, 80, 80, 30);
	getContentPane().add(nameLable);
        
        JLabel middleNameLable = new JLabel("Middle Name :");
	middleNameLable.setBounds(40, 120, 80, 30);
	getContentPane().add(middleNameLable);
        
        JLabel surnameLable = new JLabel("Surname :");
	surnameLable.setBounds(40, 160, 80, 30);
	getContentPane().add(surnameLable);
        
        JLabel usernameLable = new JLabel("Username :");
	usernameLable.setBounds(40, 200, 80, 30);
	getContentPane().add(usernameLable);
        
        JLabel passwordLable = new JLabel("Pasword :");
	passwordLable.setBounds(40, 240, 80, 30);
	getContentPane().add(passwordLable);
          
    }
    
    public void backButton(){
        backButton = new JButton("Back");
        backButton.setBounds(300, 350, 100, 30);
	getContentPane().add(backButton);
    }
}
