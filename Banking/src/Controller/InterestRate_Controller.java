/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home_View;
import View.InterestRate_View;
import View.Login_View;
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
        interestView.setActionCalculateButton(new InterestRate_Controller.CalculateAction());
        interestView.setActionHomeButton(new InterestRate_Controller.HomeAction());
    }
    
    private class CalculateAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String amount = interestView.getAmount();
            String rate = interestView.getRate();
            String time = interestView.getTime();
        }
    }
    //Home Button
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
