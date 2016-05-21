/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
            String customerID = withdrawView.getAccountNo();
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
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
            int amount = Integer.parseInt(withdrawView.getAmount());
            CustomerAccount customer = daoCustomer.getOneCustomer(accountNo);
            withdraw.withdraw(amount, customer);
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
