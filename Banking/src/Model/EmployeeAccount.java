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
public class EmployeeAccount {
    private String username;
    private String password;
    private Name name;
    private int id;
    
    public EmployeeAccount(String username, String password, Name name, int id){
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = id;
    }
    
    public EmployeeAccount(EmployeeAccount employee, String newPassword){
        this.username = employee.username;
        this.name = employee.name;
        this.password = newPassword;
    }
       
     public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getEmployeeID(){
        return id;
    }
    
    public Name getName(){
        return name;
    }
}
