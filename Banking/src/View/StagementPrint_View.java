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
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_View extends JFrame {
    private JTextField accountNoField;
    private JButton searchButton;
    private JButton nextButton;
    private JTable table;
    
    public StagementPrint_View(){
        makeFrame();
        inComponent();
        button();
    }
    
    public static void main (String [] args){
        new StagementPrint_View().setVisible(true);
    }
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Print stagement");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        JLabel accountIDLable = new JLabel("Account No.:");
	accountIDLable.setBounds(100, 20, 80, 30);
	getContentPane().add(accountIDLable);
        
        accountNoField = new JTextField("");
	accountNoField.setBounds(200, 20, 250, 30);
	getContentPane().add(accountNoField);
        
        JFrame background = new JFrame();
        background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
        
        /*table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "CODE", "AMOUNT", "BALANCE", "STAFF ID"
            } ));*/
    }
    
    public void button(){
        searchButton = new JButton("Search");
        searchButton.setBounds(500, 20, 100, 30);
	getContentPane().add(searchButton);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(350, 170, 70, 30);
	getContentPane().add(nextButton);
        
    }
    
    public void setActionSearchButton(ActionListener action){
        searchButton.addActionListener(action);
    }    
    public void setActionNextButton(ActionListener action){
        nextButton.addActionListener(action);
    }
    
    
}
