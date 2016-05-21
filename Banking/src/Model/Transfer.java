/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Burin
 */
public class Transfer {
    
    DAOTransaction daoTransaction;
    DAOCustomerAccount daoCustomer;
    
    public Transfer(DAOTransaction daoTransaction, DAOCustomerAccount daoCustomer){
        this.daoTransaction = daoTransaction;
        this.daoCustomer = daoCustomer;
    }
    
    public void transfer(CustomerAccount my, CustomerAccount target, double amount){
        updateCustomer(my, amount*(-1));
        updateCustomer(target, amount);
        addTransaction(my, amount*(-1));
        addTransaction(target, amount);
    }
    
    private void updateCustomer(CustomerAccount customer, double amount){
        int id = Integer.parseInt(customer.getID().substring(1));
        double balance = customer.getBalance() + amount;
        CustomerAccount updateCustomer = new CustomerAccount(customer, balance);
        daoCustomer.updateCustomerBalance(updateCustomer);
    }
    
    private void addTransaction(CustomerAccount customer, double amount){
        int id = Integer.parseInt(customer.getID().substring(1));
        double balance = customer.getBalance() + amount;
        String date = new Timestamp((new Date()).getTime()).toString();
        String type = "TRANSFER";
        EmployeeAccount login = AccessSystem.getLoginAccount();
        String description = login.getBranch();
        int employeeID= Integer.parseInt(login.getEmployeeID().substring(1));
        Transaction myTrans = new Transaction(date, type, description, balance, amount, id, employeeID);
        daoTransaction.addNewTransaction(myTrans);
    }
}
