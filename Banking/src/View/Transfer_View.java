/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
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
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JTextField toAccountNoField;
    private JLabel tonameLabel;
    private JLabel tosurnameLabel;
    private JTextField amountField;
    private JButton searchButton;
    private JButton tosearchButton;
    private JButton clearButton;
    private JButton submitButton; 
    private JButton homeButton;
    
    
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
        setLocationRelativeTo(null);
        setResizable(false);
	getContentPane().setLayout(null);
        
    }
    
    private void inComponent(){
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 700, 1100);
        imageLabel.setIcon(new ImageIcon("picture/icon.png")); 
        getContentPane().add(imageLabel);
        
        JLabel accountNoLable = new JLabel("Account No. :");
	accountNoLable.setBounds(40, 20, 100, 30);
	getContentPane().add(accountNoLable);
        
        accountNoField = new JTextField("");
	accountNoField.setBounds(150, 20, 160, 30);
	getContentPane().add(accountNoField);
        
        JLabel nameLable = new JLabel("Name. :");
	nameLable.setBounds(40, 60, 80, 30);
	getContentPane().add(nameLable);
        
        nameLabel = new JLabel("");
	nameLabel.setBounds(150, 60, 160, 30);
        nameLabel.setForeground(Color.RED);
	getContentPane().add(nameLabel);
        
        JLabel surnameLable = new JLabel("Surname :");
	surnameLable.setBounds(350, 60, 80, 30);
	getContentPane().add(surnameLable);
        
        surnameLabel = new JLabel("");
	surnameLabel.setBounds(450, 60, 160, 30);
        surnameLabel.setForeground(Color.RED);
	getContentPane().add(surnameLabel);
        
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
        
        tonameLabel = new JLabel("");
	tonameLabel.setBounds(150, 220, 160, 30);
        tonameLabel.setForeground(Color.RED);
	getContentPane().add(tonameLabel);
        
        JLabel toSurnameLable = new JLabel("Surname :");
	toSurnameLable.setBounds(350, 220, 80, 30);
	getContentPane().add(toSurnameLable);
        
        tosurnameLabel = new JLabel("");
	tosurnameLabel.setBounds(450, 220, 160, 30);
        tosurnameLabel.setForeground(Color.RED);
	getContentPane().add(tosurnameLabel);
        
        JFrame background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
    }
    
    private void button(){
        searchButton = new JButton("Search");
        searchButton.setBounds(350, 20, 100, 30);
	getContentPane().add(searchButton);
        
        tosearchButton = new JButton("Search");
        tosearchButton.setBounds(350, 180, 100, 30);
	getContentPane().add(tosearchButton);
        
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
        String name = nameLabel.getText();
        return name;
    }
    public void setName(String name){
        nameLabel.setText(name);
    }
    public String getSurname(){
        String surname = surnameLabel.getText();
        return surname;
    }
    public void setSurname(String surname){
        surnameLabel.setText(surname);
    }
    public String getAmount(){
        String amount = amountField.getText();
        return amount;
    }
    public void setAmount(int amount){
        amountField.setText(Integer.toString(amount));
    }
    public String getToAccountNo(){
        String toAccountNo = toAccountNoField.getText();
        return toAccountNo;
    }
    public String getToName(){
        String toName = tonameLabel.getText();
        return toName;
    }
     public void setToName(String name){
        tonameLabel.setText(name);
    }
    public String getToSurname(){
        String toSurname = tosurnameLabel.getText();
        return toSurname;
    }
    public void setToSurname(String surname){
        tosurnameLabel.setText(surname);
    }
    
    public void setActionSearchButton(ActionListener action){
        searchButton.addActionListener(action);
    }
    public void setActionTargetSearchButton(ActionListener action){
        tosearchButton.addActionListener(action);
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
    
    public void clearText(){
        accountNoField.setText("");
        nameLabel.setText("");
        surnameLabel.setText("");
        amountField.setText("");
        toAccountNoField.setText("");
        tonameLabel.setText("");
        tosurnameLabel.setText("");
    }
}
