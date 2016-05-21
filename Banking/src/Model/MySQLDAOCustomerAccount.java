/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Burin
 */
public class MySQLDAOCustomerAccount implements DAOCustomerAccount{

    MySQLMapper<CustomerAccount> myMapper;
    MySQLExecute<CustomerAccount> databaseExecute;
    
    public MySQLDAOCustomerAccount(MySQLMapper<CustomerAccount> myMapper, MySQLExecute<CustomerAccount> databaseExecute){
        this.myMapper  = myMapper;
        this.databaseExecute = databaseExecute;
    }
    
    private List<CustomerAccount> getList(String sql){
        List<CustomerAccount> all_emp = null;
        all_emp = databaseExecute.executeQueryObject(sql, myMapper);           
        return all_emp;
    }
    
    @Override
    public int countCustomer() {
        List<CustomerAccount> mylist = getAllCustomer();
        return mylist.size();
    }

    @Override
    public List<CustomerAccount> getAllCustomer() {
        String sql = "Something";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListByMiddleName(String middle_name) {
        String sql = "SELECT * FROM `BANK_CUSTOMER` where middle_name = '" + middle_name + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListByName(String name) {
        String sql = "SELECT * FROM `BANK_CUSTOMER` where name = '" + name + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListBySurName(String surname) {
        String sql = "SELECT * FROM `BANK_CUSTOMER` where surname = '" + surname + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public CustomerAccount getOneCustomer(String id) {
        String sql = "SELECT * FROM `BANK_CUSTOMER` where username = '"+ Integer.parseInt(id)+ "'";
        List<CustomerAccount> all_emp = null;
        CustomerAccount my_emp = null;
        all_emp = databaseExecute.executeQueryObject(sql, myMapper);
        my_emp = null;
        if(!all_emp.isEmpty()){
            for(CustomerAccount emp : all_emp){
                my_emp = emp;
            }
        }
        return my_emp;
    }

    @Override
    public void updateCustomerBalance(CustomerAccount updateBalance) {
        String sql = "UPDATE BANK_CUSTOMER SET balance = '" + updateBalance.getBalance()+ "' WHERE id = ('" + Integer.parseInt(updateBalance.getID())+ "')";
        databaseExecute.excuteQuery(sql);
    }

    @Override
    public void addCustomerAccount(CustomerAccount newCustomer) {
        int id = Integer.parseInt(newCustomer.getID());
        String name = newCustomer.getName().getName();
        String middlename = newCustomer.getName().getMiddleName();
        String surname = newCustomer.getName().getSurname();
        double balance = newCustomer.getBalance();
        String date = newCustomer.getDate();
        String email = newCustomer.getEmail();
        String phone = newCustomer.getPhoneNumber();
        String address1 = newCustomer.getAddress().getAddress1();
        String address2 = newCustomer.getAddress().getAddress2();
        String province = newCustomer.getAddress().getProvince();
        String postcode = newCustomer.getAddress().getPostCode();
        String sql = "INSERT INTO "
                + "BANK_CUSTOMER(id,name,middlename,surname,balance,date,email,phone)"
                + "VALUES ('" + id + "','" + name + "','" + middlename + "','" + surname
                + "','" + balance + "','" + date + "','" + email + "','" + phone +  "')";
        databaseExecute.excuteQuery(sql);
        sql = "INSERT INTO "
                + "BANK_CUSTOMER(address_one,address_two,province,postcode, id)"
                + "VALUES ('" + address1 + "','" + address2 + "','" + province + "','" + postcode
                + "','" + id + "')";
        databaseExecute.excuteQuery(sql);
    }
    
    
    
}
