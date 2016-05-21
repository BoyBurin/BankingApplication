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
public class MySQLDAOTransaction implements DAOTransaction{
    
    MySQLMapper<Transaction> myMapper;
    MySQLExecute<Transaction> databaseExecute;
    
    public MySQLDAOTransaction(MySQLMapper<Transaction> myMapper, MySQLExecute<Transaction> databaseExecute){
        this.myMapper  = myMapper;
        this.databaseExecute = databaseExecute;
    }

    @Override
    public void addNewTransaction(Transaction myTrans) {
        int customerID = Integer.parseInt(myTrans.getCustomerID().substring(1));
        int employeeID = Integer.parseInt(AccessSystem.getLoginAccount().getEmployeeID().substring(1));
        String date = myTrans.getDate();
        String type = myTrans.getType();
        String description = myTrans.getDescription();
        double paidin = myTrans.getPaidIn();
        double paidout = myTrans.getPaidOut();
        double balance = myTrans.getBalance();
        String sql = "INSERT INTO "
                + "BANK_TRANSACTION(customer_id,employee_id,date,type,description,paid_in,paid_out,balance)"
                + "VALUES ('" + customerID + "','" + employeeID + "','" + date + "','" + type
                + "','" + description + "','" + paidin + "','" + paidout + "','" + balance +  "')";
        databaseExecute.excuteQuery(sql);
    }

    @Override
    public List<Transaction> getTransactionListbyID(String id) {
         String sql = "SELECT * FROM `BANK_TRANSACTION` where customer_id = '" + Integer.parseInt(id.substring(1)) + "'" + "ORDER BY Date DESC";
         List<Transaction> all_emp = databaseExecute.executeQueryObject(sql, myMapper);    
         return all_emp;
    }
    
}
