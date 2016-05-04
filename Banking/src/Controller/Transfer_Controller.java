/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


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
        transferView.setActionSearchButton(new Transfer_Controller.SearchAction());
        transferView.setActionSubmitButton(new Transfer_Controller.submitAction());
        transferView.setActionClearButton(new Transfer_Controller.clearAction());
        transferView.setActionHomeButton(new Transfer_Controller.HomeAction());
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
            String accountNo = transferView.getAccountNo();
            String name = transferView.getName();
            String surname = transferView.getSurname();
            String amount = transferView.getAmount();
            String toAccountNo = transferView.getToAccountNo();
            String toName = transferView.getToName();
            String toSurname = transferView.getToSurname();
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
                transferView.dispose();
        }
    }
    
    public static void main(String[] args){
        new Transfer_Controller();
    }
}
