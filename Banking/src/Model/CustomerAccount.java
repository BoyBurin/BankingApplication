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
public class CustomerAccount {
    private String id;
    private Name name;
    private double balance;
    private String date;
    private String email;
    private String phoneNumber;
    //private String address;
    
    public CustomerAccount(int id, Name name, double balance, String date, String email, String phoneNumber){
        this.name = name;
        this.balance = balance;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getID(){
        String myID = makeIDPattern();
        return myID;
    }
    
    private String makeIDPattern(){
        String myID = id;
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
}
