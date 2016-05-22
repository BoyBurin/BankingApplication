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
public class InterestRate_View extends JFrame {
    
    private JTextField accountNoField;
    private JButton searchButton;
    private JButton clearButton;
    private JButton showButton; 
    private JButton homeButton;
    private JLabel  lastbalancelabel;
    private JLabel  interestlabel;
    private JLabel  presentbalancelabel;
    private JLabel namelabel;
    private JLabel middlenamelabel;
    private JLabel surnamelabel;
        
    
    public InterestRate_View(){
        makeFrame();
        inComponent();
        button();
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Show Interest Rate ");
	getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
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
        
        JLabel lastBalanceLable = new JLabel("LastBalance :");
	lastBalanceLable.setBounds(40, 60, 100, 30);
	getContentPane().add(lastBalanceLable);
        
        lastbalancelabel = new JLabel("");
	lastbalancelabel.setBounds(160, 60, 100, 30);
        lastbalancelabel.setForeground(Color.blue);
	getContentPane().add(lastbalancelabel);
                
        JLabel bathLable = new JLabel("Bath");
	bathLable.setBounds(350, 60, 80, 30);
	getContentPane().add(bathLable);
        
        JLabel rateLable = new JLabel("Interest :");
	rateLable.setBounds(40, 100, 80, 30);
	getContentPane().add(rateLable);
        
        interestlabel = new JLabel("");
	interestlabel.setBounds(160, 100, 100, 30);
        interestlabel.setForeground(Color.blue);
	getContentPane().add(interestlabel);
        
        JLabel persentLable = new JLabel("% Per year");
	persentLable.setBounds(350, 100, 80, 30);
	getContentPane().add(persentLable);
        
        JLabel presentBalanceLable = new JLabel("PresentBalance :");
	presentBalanceLable.setBounds(40, 140, 120, 30);
	getContentPane().add(presentBalanceLable);
        
        presentbalancelabel = new JLabel("");
	presentbalancelabel.setBounds(160, 140, 100, 30);
        presentbalancelabel.setForeground(Color.blue);
	getContentPane().add(presentbalancelabel);
        
        JLabel nameLable = new JLabel("Name :");
	nameLable.setBounds(40, 180, 80, 30);
	getContentPane().add(nameLable);
        
        namelabel = new JLabel("");
	namelabel.setBounds(160, 180, 100, 30);
        namelabel.setForeground(Color.red);
	getContentPane().add(namelabel);
        
        JLabel usernameLable = new JLabel("Middlename :");
	usernameLable.setBounds(40,220, 80, 30);
	getContentPane().add(usernameLable);
        
        middlenamelabel = new JLabel("");
	middlenamelabel.setBounds(160, 220, 160, 30);
        middlenamelabel.setForeground(Color.red);
	getContentPane().add(middlenamelabel);
        
        JLabel passwordLable = new JLabel("Surname :");
	passwordLable.setBounds(40, 260, 80, 30);
	getContentPane().add(passwordLable);
        
        surnamelabel = new JLabel("");
	surnamelabel.setBounds(160, 260, 160, 30);
        surnamelabel.setForeground(Color.red);
	getContentPane().add(surnamelabel);
        
                
        JLabel yearLable = new JLabel("Bath");
	yearLable.setBounds(350, 140, 80, 30);
	getContentPane().add(yearLable);
        
        JFrame background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
    }
    
    private void button(){
        searchButton = new JButton("Search");
        searchButton.setBounds(350, 20, 100, 30);
	getContentPane().add(searchButton);
        
        showButton = new JButton("Show");
        showButton.setBounds(200, 320, 100, 30);
	getContentPane().add(showButton);
        showButton.setVisible(false);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(400, 320, 100, 30);
	getContentPane().add(homeButton);
        
    }
    
     public void setName(String name){
        namelabel.setText(name);
    }
     
     public void setSurname(String surname){
        surnamelabel.setText(surname);
    }
     
      public void setMiddleName(String middlename){
        middlenamelabel.setText(middlename);
    }
    
    public String getAccountNo(){
        String accountNo = accountNoField.getText();
        return accountNo;
    }
    
    public void setLastBalance(double lastbalance){
        lastbalancelabel.setText(Double.toString(lastbalance));
    }
    
    public void setPresentBalance(double presentbalance){
        presentbalancelabel.setText(Double.toString(presentbalance));
    }
    
    public void setInterest(double interest){
        interestlabel.setText(Double.toString(interest));
    }
    
    public void setActionSearchButton(ActionListener action){
        searchButton.addActionListener(action);
    }
    public void setActionShowButton(ActionListener action){
        showButton.addActionListener(action);
    }
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
    
    public void setVisibleShowButton(boolean visible){
        showButton.setVisible(visible);
    }
    
    public void setTextfieldID(boolean visible){
        accountNoField.setEnabled(visible);
    }
    
    public void clearText(){
        lastbalancelabel.setText("");
        presentbalancelabel.setText("");
        interestlabel.setText("");
        namelabel.setText("");
        middlenamelabel.setText("");
        surnamelabel.setText("");
    }
}
