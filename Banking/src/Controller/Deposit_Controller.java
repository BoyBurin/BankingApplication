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
import Model.Deposit;
import Model.MySQLBankingFactory;
import Model.MySQLDAOCustomerAccount;
import Model.MySQLDAOTransaction;
import Model.Name;
import View.Deposit_View;
import View.Home_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class Deposit_Controller {
    Deposit_View depositView;
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;
    Deposit deposit;
    
    public Deposit_Controller(){
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        daoTransaction = new MySQLBankingFactory().getDAOTransaction();
        depositView = new Deposit_View();
        deposit = new Deposit(daoCustomer, daoTransaction);
        depositView.setVisible(true);
        depositView.setActionSearchButton(new Deposit_Controller.SearchAction());
        depositView.setActionSubmitButton(new Deposit_Controller.submitAction());
        depositView.setActionClearButton(new Deposit_Controller.clearAction());
        depositView.setActionHomeButton(new Deposit_Controller.HomeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = depositView.getAccountNo().trim();
            if(customerID.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkCustomerIDPattern(customerID)){
                JOptionPane.showMessageDialog(null,"Customer ID not match!","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            if(customer == null){
                 JOptionPane.showMessageDialog(null,"Not Found Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Name name = customer.getName();
            String firstname = name.getName();
            String surname = name.getSurname();
            depositView.setName(firstname);
            depositView.setSurname(surname);
            depositView.setAmount(0);
        }
    }
    //Submit
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = depositView.getAccountNo().trim();
            if(accountNo.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkCustomerIDPattern(accountNo)){
                JOptionPane.showMessageDialog(null,"Customer ID not match!","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String amount = depositView.getAmount();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Amount","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(CheckPattern.checkDoublePattern(amount)){
                JOptionPane.showMessageDialog(null,"Please input Integer","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(Double.parseDouble(amount) <= 0){
                JOptionPane.showMessageDialog(null,"Please input Positive number in Amount field","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(Integer.parseInt(amount) > 300000){
                JOptionPane.showMessageDialog(null,"Please input less than 300,000 baht","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            CustomerAccount customer = daoCustomer.getOneCustomer(accountNo);
            deposit.deposit(Integer.parseInt(amount), customer);
            JOptionPane.showMessageDialog(null,"Deposit Successful","Message",JOptionPane.INFORMATION_MESSAGE);
            Home_Controller home = new Home_Controller();
            depositView.dispose();
            
        }
    }
    
    //Clear
    private class clearAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            depositView.clearText();
        }
    }
    
    //Home
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                depositView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Deposit_Controller();
    }
    
}
