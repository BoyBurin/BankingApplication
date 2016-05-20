/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home_View;
import View.Withdraw_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class Withdraw_Controller {
    Withdraw_View withdrawView;

    public Withdraw_Controller() {
        withdrawView = new Withdraw_View();
        withdrawView.setVisible(true);
        withdrawView.setActionSearchButton(new Withdraw_Controller.SearchAction());
        withdrawView.setActionSubmitButton(new Withdraw_Controller.submitAction());
        withdrawView.setActionClearButton(new Withdraw_Controller.clearAction());
        withdrawView.setActionHomeButton(new Withdraw_Controller.HomeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
        }
    }
    
    //Submit
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = withdrawView.getAccountNo();
            String name = withdrawView.getName();
            String surname = withdrawView.getSurname();
            String amount = withdrawView.getAmount();
        }
    }
    
    //Clear
    private class clearAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
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
