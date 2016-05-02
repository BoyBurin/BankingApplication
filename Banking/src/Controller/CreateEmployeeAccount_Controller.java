/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CreateEmployeeAccount_View;
import View.Home_View;
import View.Login_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class CreateEmployeeAccount_Controller {
    CreateEmployeeAccount_View createEmployeeAccountView;

    public CreateEmployeeAccount_Controller() {
        createEmployeeAccountView = new CreateEmployeeAccount_View();
        createEmployeeAccountView.setVisible(true);
        createEmployeeAccountView.setActionHomeButton(new HomeAction());
    }
    
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                createEmployeeAccountView.dispose();
        }
    }
    
    public static void main(String[] args){
        new CreateEmployeeAccount_Controller();
    }
}
