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
import java.sql.Timestamp;
import java.util.jar.Attributes;
import java.util.Date;
/**
 *
 * @author Kango_000
 */
public class CreateAccount_Controller {
    CreateAccount_View createAccView;
    DAOCustomerAccount daoCustomer;
    Timestamp date;
    
    public static void main (String[]ags){
        new CreateAccount_Controller();
    }
    
    public CreateAccount_Controller(){
        daoCustomer = new MySQLBankingFactory().getDAOCustomer();
        createAccView = new CreateAccount_View();
        createAccView.setVisible(true);
        createAccView.setActionCreateButton(new CreateAccAction());
        createAccView.setActionHomeButton(new HomeAction());
        createAccView.setActionClearButton(new ClearAction());
	date = new Timestamp((new Date()).getTime());
        createAccView.setDate(date.toString().substring(0,10));
    }
    
    private class CreateAccAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String firstname = createAccView.getName();
            String middleName = createAccView.getMiddleName();
            String surname = createAccView.getSurname();
            Double balance = createAccView.getBalance();
            String email = createAccView.getEmail();
            String phone = createAccView.getPhone();
            String addressLine1 = createAccView.getAddressLine1();
            String addressLine2 = createAccView.getAddressLine2();
            String province = createAccView.getProvince();
            String zipCode = createAccView.getZipCode();
            Name name = new Name(firstname, middleName, surname);
            Address address = new Address(addressLine1, addressLine2, province, zipCode);
            CustomerAccount newCustomer = new CustomerAccount(name, balance, date.toString(), email, phone, address);
            daoCustomer.addCustomerAccount(newCustomer);
            Home_Controller home = new Home_Controller();
            createAccView.dispose();
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
    
    private class ClearAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            createAccView.clearText();
        }
    }
    
}
