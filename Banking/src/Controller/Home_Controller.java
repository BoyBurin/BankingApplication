/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Deposit_View;
import View.Home_View;
import View.InterestRate_View;
import View.Login_View;
import View.StagementPrint_View;
import View.Transfer_View;
import View.Withdraw_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class Home_Controller {
    Home_View homeView;
    
    public Home_Controller() {
        homeView = new Home_View();
        homeView.setVisible(true);
        homeView.setActionDepositButton(new depositAction());
        homeView.setActionWithdrawButton(new withdrawAction());
        homeView.setActionTransferButton(new transferAction());
        homeView.setActionStagementPrintOutButton(new stagementPrintOutAction());
        homeView.setActionLogOutButton(new logoutAction());
        homeView.setActionInterestButton(new interestAction());
        homeView.setActionCustomerAccountButton(new CustomerAccountAction());
        homeView.setActionEmployeeButton(new EmployeeAction());
    }
    
    //Deposit Button
    private class depositAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Deposit_Controller deposit = new Deposit_Controller();
            homeView.dispose();
            
        }
    }
    //Withdraw Button
    private class withdrawAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Withdraw_Controller withdraw = new Withdraw_Controller();
            homeView.dispose();
            
        }
    }
    //Transfer Button
    private class transferAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Transfer_Controller transfer = new Transfer_Controller();
            homeView.dispose();
            
        }
    }
    //StagementPrintOut Button
    private class stagementPrintOutAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            StagementPrint_Controller stagementPrint = new StagementPrint_Controller();
            homeView.dispose();
            
        }
    }
    //Interest Button
    private class interestAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            InterestRate_Controller interest = new InterestRate_Controller();
            homeView.dispose();
            
        }
    }
    //employeeAccount Button
    private class CustomerAccountAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            CreateAccount_Controller customerAccount = new CreateAccount_Controller();
            homeView.dispose();
        }
    }
    //Logout Button
    private class logoutAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Login_Controller login = new Login_Controller();
            homeView.dispose();
        }
    }
    
    private class EmployeeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            CreateEmployeeAccount_Controller employee = new CreateEmployeeAccount_Controller();
            homeView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Home_Controller();
    }
    
}
