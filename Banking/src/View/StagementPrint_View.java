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
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_View extends JFrame {
    
    private JButton printButton;
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
	setTitle("Interest Rate Calculator");
	getContentPane().setLayout(null);
    }
    
    private void inComponent(){
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "CODE", "AMOUNT", "BALANCE", "STAFF ID"
            } ));
    }
    
    public void button(){
        printButton = new JButton("Print");
        printButton.setBounds(80, 170, 70, 30);
	getContentPane().add(printButton);
        
    }
    
        
    public void setActionPrintButton(ActionListener action){
        printButton.addActionListener(action);
    }
    
    
}
