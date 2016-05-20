/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home_View;
import View.InterestRate_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class InterestRate_Controller {
    InterestRate_View interestView;
    
    public InterestRate_Controller(){
        interestView = new InterestRate_View();
        interestView.setVisible(true);
        interestView.setActionShowButton(new InterestRate_Controller.SearchAction());
        interestView.setActionShowButton(new InterestRate_Controller.ShowAction());
        interestView.setActionHomeButton(new InterestRate_Controller.HomeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
        }
    }
    
    //Show
    private class ShowAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String accountNo = interestView.getAccountNo();
            
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
