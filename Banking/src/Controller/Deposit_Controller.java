/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Deposit_View;
import View.Home_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class Deposit_Controller {
    Deposit_View depositView;
    
    public Deposit_Controller(){
        depositView = new Deposit_View();
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
            
        }
    }
    //Submit
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = depositView.getAccountNo();
            String name = depositView.getName();
            String surname = depositView.getSurname();
            String amount = depositView.getAmount();
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
                depositView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Deposit_Controller();
    }
    
}
