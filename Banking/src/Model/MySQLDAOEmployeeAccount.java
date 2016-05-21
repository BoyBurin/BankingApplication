/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Burin
 */
public class MySQLDAOEmployeeAccount implements DAOEmployeeAccount {
    MySQLMapper<EmployeeAccount> myMapper;
    MySQLExecute<EmployeeAccount> databaseExecute;
     
    public MySQLDAOEmployeeAccount(MySQLMapper<EmployeeAccount> myMapper, MySQLExecute<EmployeeAccount> databaseExecute){
        this.myMapper = myMapper;
        this.databaseExecute = databaseExecute;
    }
    
    @Override
    public EmployeeAccount getOneEmployee(String username){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` WHERE username =" +"'"+ username + "'";
        List<EmployeeAccount> all_emp = null;
        EmployeeAccount my_emp = null;
        all_emp = databaseExecute.executeQueryObject(sql, myMapper);
        if(!all_emp.isEmpty()){
            for(EmployeeAccount emp : all_emp){
                my_emp = emp;
            }
        }
        return my_emp;
    }
    
    private List<EmployeeAccount> getList(String sql){
        List<EmployeeAccount> all_emp = null;
        all_emp = databaseExecute.executeQueryObject(sql, myMapper);           
        return all_emp;
    }
    
    @Override
    public List<EmployeeAccount> getAllEmployee(){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` ";
        List<EmployeeAccount> all_emp = getList(sql);     
        return all_emp;
    }
    
    @Override
    public List<EmployeeAccount> getListByName(String name){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` where name = '" + name + "'";
        List<EmployeeAccount> all_emp = getList(sql);     
        return all_emp;
    }
    
    @Override
    public List<EmployeeAccount> getListByMiddleName(String middle_name){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` where middle_name = '" + middle_name + "'";
        List<EmployeeAccount> all_emp = getList(sql);     
        return all_emp;
    }
    
    @Override
    public List<EmployeeAccount> getListBySurName(String surname){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` where surname = '" + surname + "'";
        List<EmployeeAccount> all_emp = getList(sql);     
        return all_emp;
    }
    
    @Override
    public int countEmployee(){
        List<EmployeeAccount> mylist = getAllEmployee();
        return mylist.size();
    }
    
    @Override
    public void updateEmployeePassword(EmployeeAccount newPassword){
        String sql = "UPDATE BANK_EMPLOYEE SET password = '" + newPassword.getPassword()+ "' WHERE username = ('" + newPassword.getUsername() + "')";
        databaseExecute.excuteQuery(sql);
    }
}
