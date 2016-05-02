/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
    
    private JTextField amountField;
    private JTextField rateField;
    private JTextField timeField;
    private JButton clearButton;
    private JButton calculateButton; 
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
	setTitle("Interest Rate Calculator");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel accountNoLable = new JLabel("Amount");
	accountNoLable.setBounds(40, 20, 100, 30);
	getContentPane().add(accountNoLable);
        
        amountField = new JTextField("");
	amountField.setBounds(150, 20, 160, 30);
	getContentPane().add(amountField);
        
        JLabel bathLable = new JLabel("Bath");
	bathLable.setBounds(350, 20, 80, 30);
	getContentPane().add(bathLable);
        
        JLabel rateLable = new JLabel("Rate :");
	rateLable.setBounds(40, 60, 80, 30);
	getContentPane().add(rateLable);
        
        rateField = new JTextField("");
	rateField.setBounds(150, 60, 160, 30);
	getContentPane().add(rateField);
        
        JLabel persentLable = new JLabel("% Per year");
	persentLable.setBounds(350, 60, 80, 30);
	getContentPane().add(persentLable);
        
        JLabel timeLable = new JLabel("Time :");
	timeLable.setBounds(40, 100, 80, 30);
	getContentPane().add(timeLable);
        
        timeField = new JTextField("");
	timeField.setBounds(150, 100, 160, 30);
	getContentPane().add(timeField);
        
        JLabel yearLable = new JLabel("Year");
	yearLable.setBounds(350, 100, 80, 30);
	getContentPane().add(yearLable);
        
    }
    
    private void button(){
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(200, 150, 100, 30);
	getContentPane().add(calculateButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 150, 100, 30);
	getContentPane().add(clearButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(300, 200, 100, 30);
	getContentPane().add(homeButton);
    }
    
    public String getAmount(){
        String amount = amountField.getText();
        return amount;
    }
    public String getRate(){
        String rate = rateField.getText();
        return rate;
    }
    public String getTime(){
        String time = timeField.getText();
        return time;
    }
    
    public void setActionCalculateButton(ActionListener action){
        calculateButton.addActionListener(action);
    }
    public void setActionCancleButton(ActionListener action){
        clearButton.addActionListener(action);
    }
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
}
