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
    private JButton createButton;
    
    public static void main(String[]args){
        new CreateEmployeeAccount_View().setVisible(true);
    }
    
    public CreateEmployeeAccount_View(){
        makeFrame();
        inComponent();
    }
    
    public void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Create Employee Account");
	getContentPane().setLayout(null);
    }
    
    public void inComponent(){
        JLabel employeeNoLable = new JLabel("Employee No. :");
	employeeNoLable.setBounds(40, 40, 100, 30);
	getContentPane().add(employeeNoLable);
        
        employeeNoField = new JTextField("");
	employeeNoField.setBounds(150, 40, 160, 30);
	getContentPane().add(employeeNoField);
        
        JLabel nameLable = new JLabel("Name :");
	nameLable.setBounds(40, 80, 80, 30);
	getContentPane().add(nameLable);
        
        employeeNameField = new JTextField("");
	employeeNameField.setBounds(150, 80, 160, 30);
	getContentPane().add(employeeNameField);
    }
    
    public void createButton(){
        createButton = new JButton("Create");
        createButton.setBounds(350, 520, 100, 30);
	getContentPane().add(createButton);
    }
    
    public String getEmployeeNo(){
        String employeeNo = employeeNoField.getText();
        return employeeNo;
    }
    
    public String getEmployeeName(){
        String employeeName = employeeNameField.getText();
        return employeeName;
    }
}
