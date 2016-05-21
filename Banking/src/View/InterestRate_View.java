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
public class InterestRate_View extends JFrame {
    
    private JTextField accountNoField;
    private JButton searchButton;
    private JButton clearButton;
    private JButton showButton; 
    private JButton homeButton;
        
    public static void main (String [] args){
        new InterestRate_View().setVisible(true);
    }
    
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
    }
    
    private void inComponent(){
        JLabel accountNoLable = new JLabel("Account No. :");
	accountNoLable.setBounds(40, 20, 100, 30);
	getContentPane().add(accountNoLable);
        
        accountNoField = new JTextField("");
	accountNoField.setBounds(150, 20, 160, 30);
	getContentPane().add(accountNoField);
        
        JLabel lastBalanceLable = new JLabel("LastBalance :");
	lastBalanceLable.setBounds(40, 60, 100, 30);
	getContentPane().add(lastBalanceLable);
                
        JLabel bathLable = new JLabel("Bath");
	bathLable.setBounds(350, 60, 80, 30);
	getContentPane().add(bathLable);
        
        JLabel rateLable = new JLabel("Interest :");
	rateLable.setBounds(40, 100, 80, 30);
	getContentPane().add(rateLable);
        
        JLabel persentLable = new JLabel("% Per year");
	persentLable.setBounds(350, 100, 80, 30);
	getContentPane().add(persentLable);
        
        JLabel presentBalanceLable = new JLabel("PresentBalance :");
	presentBalanceLable.setBounds(40, 140, 80, 30);
	getContentPane().add(presentBalanceLable);
                
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
        showButton.setBounds(200, 200, 100, 30);
	getContentPane().add(showButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(400, 200, 100, 30);
	getContentPane().add(homeButton);
        
    }
    
    public String getAccountNo(){
        String accountNo = accountNoField.getText();
        return accountNo;
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
}
