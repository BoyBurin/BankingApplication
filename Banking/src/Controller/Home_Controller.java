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
    Deposit_View depositView;
    Transfer_View transferView;
    Withdraw_View withdrawView;
    InterestRate_View interestView;
    StagementPrint_View stagementPrintView;
    

    public Home_Controller() {
        homeView = new Home_View();
        homeView.setVisible(true);
        homeView.setActionDepositButton(new Home_Controller.depositAction());
        homeView.setActionWithdrawButton(new Home_Controller.withdrawAction());
        homeView.setActionTransferButton(new Home_Controller.transferAction());
        homeView.setActionStagementPrintOutButton(new Home_Controller.stagementPrintOutAction());
        homeView.setActionLogOutButton(new Home_Controller.logoutAction());
        homeView.setActionInterestButton(new Home_Controller.interestAction());
    }
    
    //Deposit Button
    private class depositAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Deposit_View deposit = new Deposit_View();
            
        }
    }
    //Withdraw Button
    private class withdrawAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Withdraw_View withdraw = new Withdraw_View();
            
        }
    }
    //Transfer Button
    private class transferAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Transfer_View transfer = new Transfer_View();
            
        }
    }
    //StagementPrintOut Button
    private class stagementPrintOutAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            StagementPrint_View stagementPrint = new StagementPrint_View();
            
        }
    }
    //Interest Button
    private class interestAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            InterestRate_View interest = new InterestRate_View();
            
        }
    }
    //Logout Button
    private class logoutAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Home_View home = new Home_View();
            
        }
    }
    
    public static void main(String[] args){
        new Home_Controller();
    }
    
}
