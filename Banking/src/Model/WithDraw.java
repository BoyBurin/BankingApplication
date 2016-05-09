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
public class WithDraw {
    
    DAOCustomerAccount daoCustomer;
    DAOTransaction daoTransaction;
    
    public WithDraw(DAOCustomerAccount daoCustomer, DAOTransaction daoTransaction){
        this.daoCustomer = daoCustomer;
        this.daoTransaction = daoTransaction;
    }
    
    public void withdraw(int amount, CustomerAccount myCustomer){
        int id = Integer.parseInt(myCustomer.getID());
        amount = amount*(-1);
        double balance = myCustomer.getBalance() + amount;
        CustomerAccount updateCustomer = new CustomerAccount(myCustomer, balance);
        daoCustomer.updateCustomerBalance(myCustomer);
        
        String date = (new java.sql.Date(System.currentTimeMillis())).toString();
        String type = "WITHDRAW";
          EmployeeAccount login = AccessSystem.getLoginAccount();
        String description = login.getBranch();
        int employeeID= Integer.parseInt(login.getEmployeeID());
        Transaction myTrans = new Transaction(date, type, description, balance, amount, id, employeeID);
        daoTransaction.addNewTransaction(myTrans);
    }
}
