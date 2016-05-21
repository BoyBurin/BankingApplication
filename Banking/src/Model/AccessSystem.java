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
public class AccessSystem {
    private static EmployeeAccount emp;
    private DAOEmployeeAccount empDAO;
    
    public AccessSystem(DAOEmployeeAccount empDAO){
        this.empDAO = empDAO;
    }
    
    public boolean login(String username, String password){
        EmployeeAccount info = empDAO.getOneEmployee(username);
        boolean success = false;
        if(info != null){
            String info_username = info.getUsername();
            String info_password = info.getPassword();
            success = checkUsername(username, info_username) && checkPassword(password, info_password);
        }
        if(success){
            this.emp = info;
        }
        return success;
        
    }
    
    private boolean checkUsername(String username, String checkusername){
        return username.equals(checkusername);
    }
    
    private boolean checkPassword(String password, String checkpassword){
        return password.equals(checkpassword);
    }
    
    public boolean logOut(){
        boolean success = false;
        if(emp != null){
            emp = null;
            success = true;
        }
        return success;
    }
    
    public static EmployeeAccount getLoginAccount(){
        return emp;
    }
}
