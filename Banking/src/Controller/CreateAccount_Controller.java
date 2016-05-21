/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Address;
import Model.CustomerAccount;
import Model.DAOCustomerAccount;
import Model.MySQLBankingFactory;
import Model.Name;
import View.CreateAccount_View;
import View.Home_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes;
/**
 *
 * @author Kango_000
 */
public class CreateAccount_Controller {
    CreateAccount_View createAccView;
    DAOCustomerAccount daoCustomer;
    
    public static void main (String[]ags){
        new CreateAccount_Controller();
    }
    
    public CreateAccount_Controller(){
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        createAccView = new CreateAccount_View();
        createAccView.setVisible(true);
        createAccView.setActionCreateButton(new CreateAction());
        createAccView.setActionHomeButton(new HomeAction());
    }
    
    private class createAccAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String firstname = createAccView.getMiddleName();
            String middleName = createAccView.getMiddleName();
            String surname = createAccView.getSurname();
            String username = createAccView.getUername();
            String password = createAccView.getPassword();
            String date = createAccView.getDate();
            String email = createAccView.getEmail();
            String phone = createAccView.getPhone();
            String addressLine1 = createAccView.getAddressLine1();
            String addressLine2 = createAccView.getAddressLine2();
            String province = createAccView.getProvince();
            String zipCode = createAccView.getZipCode();
            Name name = new Name(firstname, middleName, surname);
            Address address = new Address(addressLine1, addressLine2, province, zipCode);
            CustomerAccount newCustomer = new CustomerAccount(name, 0, date, email, phone, address);
            daoCustomer.addCustomerAccount(newCustomer);
        }
    }
    
    //Create
    private class CreateAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
        }
    }
    
    //Home
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                createAccView.dispose();
        }
    }
    
}
