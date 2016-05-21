/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Burin
 */
public interface DAOCustomerAccount {
    
     public abstract int countCustomer();

     public abstract List<CustomerAccount> getAllCustomer();

     public abstract List<CustomerAccount> getListByMiddleName(String middle_name);

     public abstract List<CustomerAccount> getListByName(String name);

     public abstract List<CustomerAccount> getListBySurName(String surname);

     public abstract CustomerAccount getOneCustomer(String id);
     
     public abstract void updateCustomerBalance(CustomerAccount updateBalance);
     
     public abstract void addCustomerAccount(CustomerAccount newCustomer);
}
