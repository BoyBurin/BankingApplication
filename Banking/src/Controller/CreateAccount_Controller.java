/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Address;
import Model.CheckPattern;
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
import javax.swing.JOptionPane;
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
            String firstname = createAccView.getName().trim();
            String middleName = createAccView.getMiddleName().trim();
            String surname = createAccView.getSurname().trim();
            String balance = createAccView.getBalance();
            String email = createAccView.getEmail();
            String phone = createAccView.getPhone();
            String addressLine1 = createAccView.getAddressLine1();
            String addressLine2 = createAccView.getAddressLine2();
            String province = createAccView.getProvince();
            String zipCode = createAccView.getZipCode();
            System.out.println(firstname + " " + surname);
            if(firstname.equals("") || surname.equals("") || balance.equals("") || email.equals("") || phone.equals("") || addressLine1.equals("")
                    || province.equals("") || zipCode.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill the remaining spaces Except Middle Name and Address Two are optional","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(CheckPattern.checkDoublePattern(balance)){
                JOptionPane.showMessageDialog(null,"Please input Integer in Balance field","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(Double.parseDouble(balance) <= 0){
                JOptionPane.showMessageDialog(null,"Please input Positive number in Balance field","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkEmailPattern(email)){
                JOptionPane.showMessageDialog(null,"Email does not match","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!CheckPattern.checkPhonePattern(phone)){
                 JOptionPane.showMessageDialog(null,"Phone number does not match","Message",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Name name = new Name(firstname, middleName, surname);
            Address address = new Address(addressLine1, addressLine2, province, zipCode);
            CustomerAccount newCustomer = new CustomerAccount(name, Double.parseDouble(balance), date.toString(), email, phone, address);
            daoCustomer.addCustomerAccount(newCustomer);
            JOptionPane.showMessageDialog(null,"Deposit Successful","Message",JOptionPane.INFORMATION_MESSAGE);
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
