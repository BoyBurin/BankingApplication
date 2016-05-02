/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Deposit_View;
import View.Home_View;
import View.Transfer_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class Transfer_Controller {
    Transfer_View transferView;
    
    public Transfer_Controller(){
        transferView = new Transfer_View();
        transferView.setVisible(true);
        transferView.setActionSubmitButton(new submitAction()); 
        transferView.setActionHomeButton(new Transfer_Controller.HomeAction());
    }
    //Submit button
    private class submitAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = transferView.getAccountNo();
            String name = transferView.getName();
            String surname = transferView.getSurname();
            String amount = transferView.getAmount();
            String toAccountNo = transferView.getToAccountNo();
            String toName = transferView.getToName();
            String toSurname = transferView.getToSurname();
        }
    }
    //Home Button
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_View home = new Home_View();
                transferView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Transfer_Controller();
    }
}
