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
public class WithDraw {
    
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;
    
    public WithDraw(DAOCustomerAccount daoCustomer, DAOTransaction daoTransaction){
        this.daoCustomer = daoCustomer;
        this.daoTransaction = daoTransaction;
    }
    
    public void withdraw(int amount, CustomerAccount myCustomer){
        int id = Integer.parseInt(myCustomer.getID().substring(1));
        amount = amount*(-1);
        double balance = myCustomer.getBalance() + amount;
        CustomerAccount updateCustomer = new CustomerAccount(myCustomer, balance);
        daoCustomer.updateCustomerBalance(updateCustomer);
        
        String date = new Timestamp((new Date()).getTime()).toString();
        String type = "WITHDRAW";
          EmployeeAccount login = AccessSystem.getLoginAccount();
        String description = login.getBranch();
        int employeeID= Integer.parseInt(login.getEmployeeID().substring(1));
        Transaction myTrans = new Transaction(date, type, description, balance, amount, id, employeeID);
        daoTransaction.addNewTransaction(myTrans);
    }
}
