/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AccessSystem;
import Model.BankingFactory;
import Model.DAOEmployeeAccount;
import Model.MySQLBankingFactory;
import Model.MySQLDAOEmployeeAccount;
import View.Home_View;
import java.awt.event.ActionListener;
import View.Login_View;
import com.gui.displayApp;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class Login_Controller {
    Login_View loginView;
    AccessSystem access;
    public Login_Controller() {
        access = new AccessSystem(new MySQLBankingFactory().getDAOEmployee());
        loginView = new Login_View();
        loginView.setVisible(true);
        loginView.setActionLoginButton(new Login_Controller.LoginAction());
    }
    
    private class LoginAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String username = loginView.getUername();
            String password = loginView.getPassword();
            if(username.equals("") || password.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill the remaining spaces!","Message",JOptionPane.INFORMATION_MESSAGE);	
            }
            else if(access.login(username, password)){
                     Home_Controller home = new Home_Controller();
                     loginView.dispose();
            }
            else{
                loginView.clearUsernamePassword();
                JOptionPane.showMessageDialog(null,"Password or Username are incorrect!","Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args){
        new Login_Controller();
    }
}
