/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CustomerAccount;
import Model.DAOCustomerAccount;
import Model.DAOTransaction;
import Model.Interest;
import Model.MySQLBankingFactory;
import Model.Name;
import View.Home_View;
import View.InterestRate_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class InterestRate_Controller {
    InterestRate_View interestView;
    DAOCustomerAccount daoCustomer;
    Interest interest;
    double rate;
    
    public InterestRate_Controller(){
        rate = 4;
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        interest = new Interest(daoCustomer);
        interestView = new InterestRate_View();
        interestView.setVisible(true);
        interestView.setActionSearchButton(new SearchAction());
        interestView.setActionShowButton(new ShowAction());
        interestView.setActionHomeButton(new HomeAction());
    }
    
    //Search
    private class ShowAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = interestView.getAccountNo();
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            Name name = customer.getName();
            String firstname = name.getName();
            String surname = name.getSurname();
            double lastbalance = customer.getBalance();
            double presentbalance = lastbalance + interest.calculate(customer, rate);
            interestView.setLastBalance(lastbalance);
            interestView.setPresentBalance(presentbalance);
            interestView.setInterest(rate);
            interestView.setTextfieldID(true);
            
        }
    }
    
    //Show
    private class SearchAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
           String customerID = interestView.getAccountNo();
           CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
           if(customer != null){
               JOptionPane.showMessageDialog(null,"Found Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
               interestView.setVisibleShowButton(true);
               interestView.setTextfieldID(false);
               interestView.clearText();
               Name  name = customer.getName();
               String firstname = name.getName();
               String middlename = name.getMiddleName();
               if(middlename.equals("")) middlename = "-";
               String surname = name.getSurname();
               interestView.setName(firstname);
               interestView.setMiddleName(middlename);
               interestView.setSurname(surname);
           }
           else{
               JOptionPane.showMessageDialog(null,"Not Found Customer ID","Message",JOptionPane.INFORMATION_MESSAGE);
               interestView.setVisibleShowButton(false);
               interestView.clearText();
           }
            
        }
    }
        
    //Home
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                interestView.dispose();
        }
    }
    
    public static void main(String[] args){
        new InterestRate_Controller();
    }
    
}
