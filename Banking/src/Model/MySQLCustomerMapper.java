/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author Burin
 */
public class MySQLCustomerMapper implements MySQLMapper<CustomerAccount>{

    @Override
    public CustomerAccount mapRow(HashMap info) {
        int id = Integer.parseInt((String)(info.get("id")));
        Name name = (Name)(info.get("id"));
        double balance = Double.parseDouble((String)(info.get("id")));
        String date = (String)(info.get("id"));
        String email = (String)(info.get("id"));
        String phoneNumber = (String)(info.get("id"));
        String address1 = (String)(info.get("id"));
        String address2 = (String)(info.get("id"));
        String province = (String)(info.get("id"));
        String postcode = (String)(info.get("id"));
        Address address = new Address(address1, address2, province, postcode);
        CustomerAccount myCustomer = new CustomerAccount(id, name, balance, date, email, phoneNumber, address);
        return myCustomer;
    }
    
}
