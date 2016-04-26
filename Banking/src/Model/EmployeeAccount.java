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
    private String branch;
    private Name name;
    private int id;
    
    public EmployeeAccount(String username, String password, Name name, int id, String branch){
        this.username = username;
        this.password = password;
        this.name = name;
        this.id = id;
        this.branch = branch;
    }
    
    public EmployeeAccount(EmployeeAccount employee, String newPassword){
        this.username = employee.username;
        this.name = employee.name;
        this.id = Integer.parseInt(employee.getEmployeeID());
        this.branch = employee.getBranch();
        this.password = newPassword;
    }
       
     public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmployeeID(){
        return makeIDPattern();
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
    
    public String getBranch(){
        return branch;
    }
}
