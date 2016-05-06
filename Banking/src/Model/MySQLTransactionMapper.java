/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author Burin
 */
public class MySQLTransactionMapper implements MySQLMapper<Transaction>{

    @Override
    public Transaction mapRow(HashMap info) {
        int customerID = Integer.parseInt((String)(info.get("customer_id")));
        int employeeID = Integer.parseInt((String)(info.get("employee_id")));
        String date = (String)(info.get("date"));
        String type = (String)(info.get("type"));
        String description = (String)(info.get("description"));
        double paidin = Double.parseDouble((String)(info.get("paid_in")));
        double paidout = Double.parseDouble((String)(info.get("paid_out")));
        double balance = Double.parseDouble((String)(info.get("balance")));
        Transaction newTrans = new Transaction(date, type, description, balance, paidin, paidout, customerID, employeeID);
        return newTrans;
    }
    
}
