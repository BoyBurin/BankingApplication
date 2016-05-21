/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AccessSystem;
import Model.CustomerAccount;
import Model.DAOCustomerAccount;
import Model.EmployeeAccount;
import Model.MySQLBankingFactory;
import Model.Name;
import View.CreateEmployeeAccount_View;
import View.Home_View;
import View.Login_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Kango_000
 */
public class CreateEmployeeAccount_Controller {
    CreateEmployeeAccount_View createEmployeeAccountView;
    DAOCustomerAccount daoCustomer;

    public CreateEmployeeAccount_Controller() {
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        createEmployeeAccountView = new CreateEmployeeAccount_View();
        createEmployeeAccountView.setVisible(true);
        createEmployeeAccountView.setActionChangPasswordButton(new ChangPasswordAction());
        createEmployeeAccountView.setActionHomeButton(new HomeAction());
        setInfo();
    }
    
    private void setInfo(){
        EmployeeAccount employee = AccessSystem.getLoginAccount();
        Name name = employee.getName();
        String firstname = name.getName();
        String middlename = name.getMiddleName();
        String surname = name.getSurname();
        createEmployeeAccountView.setIDLebel(employee.getEmployeeID());
        createEmployeeAccountView.setnameLebel(firstname);
        createEmployeeAccountView.setMiddlenameLebel(middlename);
        createEmployeeAccountView.setSurnameLebel(surname);
        createEmployeeAccountView.setUsernameLebel(employee.getUsername());
    }
    
    private class ChangPasswordAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                
        }
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
