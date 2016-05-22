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
public class CheckPattern {
    
    public static boolean checkNamePattern(String name){
        if(name.length() > 25) return false;
        if(name.split("\\s+").length > 1) return false;
        if(name.length() > 3) return true;
        return false;
        /*String pattern = "\\w{8,25}";
        return name.matches(pattern);*/
    }
    
    public static boolean checkDoublePattern(String number){
        String pattern = "\\d+\\.[0-9]*";
        return number.matches(pattern);
    }
    
    public static boolean checkEmailPattern(String email){
        if(email.length() > 35) return false;
        String pattern = "\\w+@(\\w+\\.)+\\w+";
        return email.matches(pattern);
    }
    
    public static boolean checkPhonePattern(String phone){
        if(phone.length() > 10) return false;
        String pattrn = "0[8-9]\\d{8}?";
        return phone.matches(pattrn);
    }
    
    public static boolean checkCustomerIDPattern(String id){
        if(id.length() > 10) return false;
        String pattern = "^c\\d{9}";
        return id.matches(pattern);
    }
    
    public static boolean checkEmployeeIDPattern(String id){
        if(id.length() > 10) return false;
        String pattern = "^e\\d{9}";
        return id.matches(pattern);
    }
}
