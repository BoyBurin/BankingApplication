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
import Model.WithDraw;
import View.Home_View;
import View.Withdraw_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class Withdraw_Controller {
    Withdraw_View withdrawView;
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;
    WithDraw withdraw;

    public Withdraw_Controller() {
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        daoTransaction = new MySQLBankingFactory().getDAOTransaction();
        withdraw = new WithDraw(daoCustomer, daoTransaction);
        withdrawView = new Withdraw_View();
        withdrawView.setVisible(true);
        withdrawView.setActionSearchButton(new SearchAction());
        withdrawView.setActionSubmitButton(new submitAction());
        withdrawView.setActionClearButton(new clearAction());
        withdrawView.setActionHomeButton(new HomeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = withdrawView.getAccountNo().trim();
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
            withdrawView.setName(firstname);
            withdrawView.setSurname(surname);
            withdrawView.setAmount(0);
        }
    }
    
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = withdrawView.getAccountNo();
            if(accountNo.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkCustomerIDPattern(accountNo)){
                JOptionPane.showMessageDialog(null,"Customer ID not match!","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String amount = withdrawView.getAmount();
            if(amount.equals("")){
                JOptionPane.showMessageDialog(null,"Please input Amount","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(CheckPattern.checkDoublePattern(amount)){
                JOptionPane.showMessageDialog(null,"Please input Again","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(Double.parseDouble(amount) <= 0){
                JOptionPane.showMessageDialog(null,"Please input Positive number in Amount field","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            CustomerAccount customer = daoCustomer.getOneCustomer(accountNo);
            if(customer.getBalance() - Integer.parseInt(amount) < 0){
                JOptionPane.showMessageDialog(null,"Your balance not enough for withdraw","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            withdraw.withdraw(Integer.parseInt(amount), customer);
            JOptionPane.showMessageDialog(null,"WidthDraw Successful","Message",JOptionPane.INFORMATION_MESSAGE);
            Home_Controller home = new Home_Controller();
            withdrawView.dispose();
            
        }
    }
    
    //Clear
    private class clearAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            withdrawView.clearText();
        }
    }
    
    //Home
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                withdrawView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Withdraw_Controller();
    }
}
