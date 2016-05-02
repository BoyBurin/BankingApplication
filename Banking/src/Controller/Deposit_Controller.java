/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Deposit_View;
import View.Home_View;
import View.Login_View;
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
        depositView.setActionSubmitButton(new submitAction());
        depositView.setActionHomeButton(new Deposit_Controller.HomeAction());
    }
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = depositView.getAccountNo();
            String name = depositView.getName();
            String surname = depositView.getSurname();
            String amount = depositView.getAmount();
        }
    }
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_View home = new Home_View();
                depositView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Deposit_Controller();
    }
    
}
