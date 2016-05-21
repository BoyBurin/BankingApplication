/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Burin
 */
public class Interest {
    DAOCustomerAccount daoCustomer;
    
    public Interest(DAOCustomerAccount daoCustomer){
        this.daoCustomer = daoCustomer; 
    }
    
    public double calculate(CustomerAccount my, double rate){
        double interest = my.getBalance() * rate / 100;
        return interest;
    }
}
