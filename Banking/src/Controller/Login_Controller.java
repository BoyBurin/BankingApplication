/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.Home_View;
import java.awt.event.ActionListener;

import View.Login_View;
import java.awt.event.ActionEvent;

/**
 *
 * @author Kango_000
 */
public class Login_Controller {
    Login_View loginView;

    public Login_Controller() {
        loginView = new Login_View();
        loginView.setVisible(true);
        loginView.setActionLoginButton(new LoginAction());
    }
    
    private class LoginAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String username = loginView.getUername();
            String password = loginView.getPassword();
            
            if(username.equals("aaa") && password.equals("aaa")){
                Home_View home = new Home_View();
                loginView.dispose();
            }
        }
    }
    
    public static void main(String[] args){
        new Login_Controller();
    }
}
