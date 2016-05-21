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
        String sql = "SELECT * FROM `BANK_CUSTOMER`, BANK_ADDRESS WHERE BANK_CUSTOMER.id = BANK_ADDRESS.customer_id";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListByMiddleName(String middle_name) {
        String sql = "SELECT * FROM `BANK_CUSTOMER`, BANK_ADDRESS WHERE BANK_CUSTOMER.id = BANK_ADDRESS.customer_id AND BANK_CUSTOMER.middle_name = '" + middle_name + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListByName(String name) {
        String sql = "SELECT * FROM `BANK_CUSTOMER`, BANK_ADDRESS WHERE BANK_CUSTOMER.id = BANK_ADDRESS.customer_id AND BANK_CUSTOMER.name = '" + name + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public List<CustomerAccount> getListBySurName(String surname) {
        String sql = "SELECT * FROM `BANK_CUSTOMER`, BANK_ADDRESS WHERE BANK_CUSTOMER.id = BANK_ADDRESS.customer_id AND BANK_CUSTOMER.surname = '" + surname + "'";
        List<CustomerAccount> all_emp = getList(sql);     
        return all_emp;
    }

    @Override
    public CustomerAccount getOneCustomer(String id) {
        String sql = "SELECT * FROM `BANK_CUSTOMER`, BANK_ADDRESS WHERE BANK_CUSTOMER.id = BANK_ADDRESS.customer_id AND BANK_CUSTOMER.id = '"+ Integer.parseInt(id)+ "'";
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
                + "BANK_CUSTOMER(name,middle_name,surname,date,balance,email,phone_number)"
                + "VALUES ('" + name + "','" + middlename + "','" + surname
                + "','" + date + "','" + balance + "','" + email + "','" + phone +  "')";
        databaseExecute.excuteQuery(sql);
        newCustomer  = getCustomerID(newCustomer);
        sql = "INSERT INTO "
                + "BANK_ADDRESS(customer_id, address_one,address_two,province,postcode)"
                + "VALUES ('" + Integer.parseInt(newCustomer.getID()) + "','"+ address1 + "','" + address2 + "','" + province + "','" + postcode
                + "')";
        databaseExecute.excuteQuery(sql);
    }
    
    private CustomerAccount getCustomerID(CustomerAccount customer){
        Name customername = customer.getName();
        String name = customername.getName();
        String middle_name = customername.getMiddleName();
        String surname = customername.getSurname();
        String sql = "SELECT * FROM `BANK_CUSTOMER`WHERE BANK_CUSTOMER.name = '" + name+ "'" + "AND middle_name = '" + middle_name + "' AND surname = '" + surname + "'";
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
    
    
    
}
