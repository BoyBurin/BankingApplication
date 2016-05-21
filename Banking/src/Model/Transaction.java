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
public class Transaction {
    
    private int customerID;
    private int employeeID;
    private String date;
    private String type;
    private String description;
    private double paidin;
    private double paidout;
    private double balance;
    
    public Transaction(String date, String type, String description, double balance, double amount, int customerID, int employeeID){
        setInfo(date, type, description, balance, customerID, employeeID);
        if(amount < 0){
            this.paidout = amount*(-1);
        }
        else{
            this.paidin = amount;
        }
    }
    
    public Transaction(String date, String type, String description, double balance, double paidin, double paidout, int customerID, int employeeID){
        setInfo(date, type, description, balance, customerID, employeeID);
        this.paidin = paidin;
        this.paidout = paidout;
    }
    
    private void setInfo(String date, String type, String description, double balance, int customerID, int employeeID){
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.date = date;
        this.type = type;
        this.description = description;
        this.balance = balance;
        this.paidin = 0;
        this.paidout = 0;
    }
    
    public String getCustomerID(){
        String myID = makeIDPattern(this.customerID, "c");
        return myID;
    }
    
    public String getEmployeeID(){
        String myID = makeIDPattern(this.employeeID, "e");
        return myID;
    }
    
    private String makeIDPattern(int id, String type){
        String myID = Integer.toString(id);
        int currentID_length = myID.length();
        int remainIDPattern = 9 - currentID_length;
        for(int start = 1 ; start <= remainIDPattern ; start++){
            myID = 0 + myID;
        }
        return type +myID;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getType(){
        return type;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPaidIn(){
        return paidin;
    }
    
    public double getPaidOut(){
        return paidout;
    }
    
    public double getBalance(){
        return balance;
    }
    
}
