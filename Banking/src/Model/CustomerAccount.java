/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.gui.deposit;

/**
 *
 * @author Burin
 */
public class CustomerAccount {
    private int id;
    private Name name;
    private double balance;
    private String date;
    private String email;
    private String phoneNumber;
    private Address address;
    
    public CustomerAccount(int id, Name name, double balance, String date, String email, String phoneNumber, Address address){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public CustomerAccount(CustomerAccount target, double updateBalance){
        copyObject(target);
        balance = updateBalance;
    }
    
    private void copyObject(CustomerAccount target){
        this.id = Integer.parseInt(target.getID());
        this.name = target.getName();
        this.balance = target.getBalance();
        this.date = target.getDate();
        this.email = target.getEmail();
        this.phoneNumber = target.getPhoneNumber();
    }
    
    public String getID(){
        String myID = makeIDPattern();
        return myID;
    }
    
    private String makeIDPattern(){
        String myID = Integer.toString(id);
        int currentID_length = myID.length();
        int remainIDPattern = 10 - currentID_length;
        for(int start = 1 ; start <= remainIDPattern ; start++){
            myID = 0 + myID;
        }
        return myID;
    }
    
    public Name getName(){
        return name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Address getAddress(){
        return address;
    }
    
    
}
