/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CheckPattern;
import Model.CustomerAccount;
import Model.DAOCustomerAccount;
import Model.DAOTransaction;
import Model.MySQLBankingFactory;
import Model.Name;
import Model.Transaction;
import View.StagementPrint_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_Controller {
    StagementPrint_View stagementPrintView;
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;


    public StagementPrint_Controller(){
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        daoTransaction = new MySQLBankingFactory().getDAOTransaction();
        stagementPrintView = new StagementPrint_View();
        stagementPrintView.setVisible(true);
        stagementPrintView.setActionSearchButton(new SearchAction());
        stagementPrintView.setActionHomeButton(new homeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = stagementPrintView.getAccountNoField().trim();
            if(customerID.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkCustomerIDPattern(customerID)){
                JOptionPane.showMessageDialog(null,"Customer ID not match!","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            if(customer != null){
                List<Transaction> transactionlist = daoTransaction.getTransactionListbyID(customerID);
                Name name = customer.getName();
                if(!transactionlist.isEmpty()){
                    stagementPrintView.clearData();
                    stagementPrintView.setName(name.toString());
                    stagementPrintView.setValueTable(transactionlist);
                    JOptionPane.showMessageDialog(null,"Found Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    stagementPrintView.setName(name.toString());
                    JOptionPane.showMessageDialog(null,"Not Found Transaction","Message",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Found Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                stagementPrintView.clearData();
            }
        }
    }
    //Home
    private class homeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Home_Controller home = new Home_Controller();
                stagementPrintView.dispose();
        }
    }
    
    public static void main(String[] args){
        new StagementPrint_Controller();
    }
}