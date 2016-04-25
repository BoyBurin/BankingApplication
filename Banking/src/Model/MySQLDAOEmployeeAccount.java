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
public class MySQLDAOEmployeeAccount extends MySQLTemplete<EmployeeAccount> implements DAOEmployeeAccount {
/*    getOneEmployeeAccount
 getAllEmployeeAccount
 CountEmployeeAccount
updateEmployeeAccount */
    
    
    public MySQLDAOEmployeeAccount(){
        super(new MySQLEmployeeMapper());
    }
    
    @Override
    public EmployeeAccount getOneEmployee(String username){
        String sql = "SELECT * FROM `BANK_EMPLOYEE` where username = '"+ username+ "'";
        List<EmployeeAccount> all_emp = null;
        EmployeeAccount my_emp = null;
        MySQLExecute<EmployeeAccount> databaseExecute = getExecute();
        MySQLMapper<EmployeeAccount> map =  getMapper();
        all_emp = databaseExecute.executeQueryObject(sql, map);
        my_emp = null;
        if(!all_emp.isEmpty()){
            for(EmployeeAccount emp : all_emp){
                my_emp = emp;
            }
        }
        return my_emp;
    }
    
    private List<EmployeeAccount> getList(String sql){
        MySQLMapper<EmployeeAccount> map =  getMapper();
        List<EmployeeAccount> all_emp = null;
        MySQLExecute<EmployeeAccount> databaseExecute = getExecute();
        all_emp = databaseExecute.executeQueryObject(sql, map);           
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
        MySQLExecute<EmployeeAccount> databaseExecute = getExecute();
        databaseExecute.excuteQuery(sql);
    }
}
