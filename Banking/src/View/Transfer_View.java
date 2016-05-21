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
public class Transfer_View extends JFrame {
    
    private JTextField accountNoField;
    private JTextField nameField;
    private JTextField surnameField;
    private JTextField toAccountNoField;
    private JTextField toNameField;
    private JTextField toSurnameField;
    private JTextField amountField;
    private JButton searchButton;
    private JButton clearButton;
    private JButton submitButton; 
    private JButton homeButton;
    
    public static void main (String [] args){
        new Transfer_View().setVisible(true);
    }
    
    public Transfer_View(){
        makeFrame();
        inComponent();
        button();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Transfer");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel accountNoLable = new JLabel("Account No. :");
	accountNoLable.setBounds(40, 20, 100, 30);
	getContentPane().add(accountNoLable);
        
        accountNoField = new JTextField("");
	accountNoField.setBounds(150, 20, 160, 30);
	getContentPane().add(accountNoField);
        
        JLabel nameLable = new JLabel("Name. :");
	nameLable.setBounds(40, 60, 80, 30);
	getContentPane().add(nameLable);
        
        nameField = new JTextField("");
	nameField.setBounds(150, 60, 160, 30);
	getContentPane().add(nameField);
        
        JLabel surnameLable = new JLabel("Surname :");
	surnameLable.setBounds(350, 60, 80, 30);
	getContentPane().add(surnameLable);
        
        surnameField = new JTextField("");
	surnameField.setBounds(450, 60, 160, 30);
	getContentPane().add(surnameField);
        
        JLabel amountLable = new JLabel("Amount :");
	amountLable.setBounds(40, 100, 80, 30);
	getContentPane().add(amountLable);
        
        amountField = new JTextField("");
	amountField.setBounds(150, 100, 160, 30);
	getContentPane().add(amountField);
        
        JLabel bathLable = new JLabel("Bath");
	bathLable.setBounds(350, 100, 80, 30);
	getContentPane().add(bathLable);
        
        JLabel lineLable = new JLabel("---------------------------------------------------------------------");
	lineLable.setBounds(40, 140, 400, 30);
	getContentPane().add(lineLable);
        
        JLabel toLable = new JLabel("TO");
	toLable.setBounds(350, 140, 40, 30);
	getContentPane().add(toLable);
        
        JLabel line2Lable = new JLabel("-----------------------------------------------------");
	line2Lable.setBounds(400, 140, 300, 30);
	getContentPane().add(line2Lable);
        
        JLabel toAccountNoLable = new JLabel("Account No. :");
	toAccountNoLable.setBounds(40, 180, 100, 30);
	getContentPane().add(toAccountNoLable);
        
        toAccountNoField = new JTextField("");
	toAccountNoField.setBounds(150, 180, 160, 30);
	getContentPane().add(toAccountNoField);
        
        JLabel toNameLable = new JLabel("Name. :");
	toNameLable.setBounds(40, 220, 80, 30);
	getContentPane().add(toNameLable);
        
        toNameField = new JTextField("");
	toNameField.setBounds(150, 220, 160, 30);
	getContentPane().add(toNameField);
        
        JLabel toSurnameLable = new JLabel("Surname :");
	toSurnameLable.setBounds(350, 220, 80, 30);
	getContentPane().add(toSurnameLable);
        
        toSurnameField = new JTextField("");
	toSurnameField.setBounds(450, 220, 160, 30);
	getContentPane().add(toSurnameField);
        
        JFrame background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
    }
    
    private void button(){
        searchButton = new JButton("Search");
        searchButton.setBounds(350, 20, 100, 30);
	getContentPane().add(searchButton);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(200, 280, 100, 30);
	getContentPane().add(submitButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 280, 100, 30);
	getContentPane().add(clearButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(300, 320, 100, 30);
	getContentPane().add(homeButton);
    }
    
    public String getAccountNo(){
        String accountNo = accountNoField.getText();
        return accountNo;
    }
    public String getName(){
        String name = nameField.getText();
        return name;
    }
    public String getSurname(){
        String surname = surnameField.getText();
        return surname;
    }
    public String getAmount(){
        String amount = amountField.getText();
        return amount;
    }
    public String getToAccountNo(){
        String toAccountNo = toAccountNoField.getText();
        return toAccountNo;
    }
    public String getToName(){
        String toName = toNameField.getText();
        return toName;
    }
    public String getToSurname(){
        String toSurname = toSurnameField.getText();
        return toSurname;
    }
    
    public void setActionSearchButton(ActionListener action){
        searchButton.addActionListener(action);
    }
    public void setActionSubmitButton(ActionListener action){
        submitButton.addActionListener(action);
    }
    public void setActionClearButton(ActionListener action){
        clearButton.addActionListener(action);
    }
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
}
