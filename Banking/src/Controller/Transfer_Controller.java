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
import Model.Transfer;
import View.Home_View;
import View.Transfer_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class Transfer_Controller {
    Transfer_View transferView;
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;
    Transfer transfer;
    
    public Transfer_Controller(){
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        daoTransaction = new MySQLBankingFactory().getDAOTransaction();
        transfer = new Transfer(daoTransaction, daoCustomer);
        transferView = new Transfer_View();
        transferView.setVisible(true);
        transferView.setActionSearchButton(new SearchAction());
        transferView.setActionSubmitButton(new submitAction());
        transferView.setActionClearButton(new clearAction());
        transferView.setActionHomeButton(new HomeAction());
        transferView.setActionTargetSearchButton(new SearchTargetAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = transferView.getAccountNo();
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            Name name = customer.getName();
            String firstname = name.getName();
            String surname = name.getSurname();
            transferView.setName(firstname);
            transferView.setSurname(surname);
            transferView.setAmount(0);
        }
    }
    
    private class SearchTargetAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = transferView.getToAccountNo();
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            Name name = customer.getName();
            String firstname = name.getName();
            String surname = name.getSurname();
            transferView.setToName(firstname);
            transferView.setToSurname(surname);
        }
    }
    
    //Submit 
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String customerID = transferView.getAccountNo();
            String targetID = transferView.getToAccountNo();
            int amount = Integer.parseInt(transferView.getAmount());
            CustomerAccount customer = daoCustomer.getOneCustomer(customerID);
            CustomerAccount target = daoCustomer.getOneCustomer(targetID);
            transfer.transfer(customer, target, amount);
            JOptionPane.showMessageDialog(null,"Transfer Successful","Message",JOptionPane.INFORMATION_MESSAGE);
            Home_Controller home = new Home_Controller();
            transferView.dispose();
            
        }
    }
        
    //Clear
    private class clearAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            transferView.clearText();
        }
    }
    
    //Home 
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                transferView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Transfer_Controller();
    }
}
