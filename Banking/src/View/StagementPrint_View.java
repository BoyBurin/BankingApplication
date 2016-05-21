/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Transaction;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_View extends JFrame {
    private JTextField accountNoField;
    private JButton searchButton;
    private JButton homeButton;
    private JTable table;
    private JLabel namelabel;
    private JLabel nameshowlabel;
    private DefaultTableModel model;
    
    public StagementPrint_View(){
        makeFrame();
        inComponent();
        button();
    }
    
    
    private void makeFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 454, 343);
        setSize(new java.awt.Dimension(700, 700));
	setTitle("Print stagement");
	getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void inComponent(){
        JLabel accountIDLable = new JLabel("Account No.:");
	accountIDLable.setBounds(100, 20, 80, 30);
	getContentPane().add(accountIDLable);
        
        accountNoField = new JTextField("");
	accountNoField.setBounds(200, 20, 250, 30);
	getContentPane().add(accountNoField);
        
        namelabel = new JLabel("Name:");
	namelabel.setBounds(100, 70, 80, 30);
	getContentPane().add(namelabel);
        
        nameshowlabel = new JLabel("");
	nameshowlabel.setBounds(200, 70, 250, 30);
        nameshowlabel.setForeground(Color.red);
	getContentPane().add(nameshowlabel);
        
        JFrame background = new JFrame();
        Color c = new Color(161,217,195); 
        getContentPane().setBackground(c);
        createTable();
               
    }
    
    private void createTable(){
        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 120, 700, 400);
        getContentPane().add(scrollPane);
        model = (DefaultTableModel) table.getModel();
        model.addColumn("Date");
        model.addColumn("Type");
        model.addColumn("Description");
        model.addColumn("Paid In");
        model.addColumn("Paid Out");
        model.addColumn("Balance");
    }   
    public void button(){
        searchButton = new JButton("Search");
        searchButton.setBounds(500, 20, 100, 30);
	getContentPane().add(searchButton);
        
        homeButton = new JButton("Home");
        homeButton.setBounds(310, 550, 70, 30);
	getContentPane().add(homeButton);
    }
    
    public void setActionSearchButton(ActionListener action){
        searchButton.addActionListener(action);
    }    
    public void setActionHomeButton(ActionListener action){
        homeButton.addActionListener(action);
    }
    
    public String getAccountNoField(){
        return accountNoField.getText();
    }
    
    public void setName(String name){
        nameshowlabel.setText(name);
    }
    
    public void setValueTable(List<Transaction> data){
        int i = 0;
        for(Transaction trans : data){
            model.addRow(new Object[0]);
            model.setValueAt(trans.getDate().substring(0,16), i, 0);
            model.setValueAt(trans.getType(), i, 1);
            model.setValueAt(trans.getDescription(), i, 2);
            model.setValueAt(trans.getPaidIn(), i, 3);
            model.setValueAt(trans.getPaidOut(), i, 4);
            model.setValueAt(trans.getBalance(), i, 5);
            i++;
        }
    }
    
    public void clearData(){
        nameshowlabel.setText("");
        model.setRowCount(0);
    }
    
    
}
