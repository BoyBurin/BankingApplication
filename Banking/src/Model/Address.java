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
public class Address {
    
    private String address1;
    private String address2;
    private String province;
    private String postcode;
    
    public Address(String addrees1, String address2, String province, String postcode){
        this.address1 = addrees1;
        this.address2 = address2;
        this.province = province;
        this.postcode = postcode;
    }
    
    @Override
    public String toString(){
        String address = "Address 1: " + address1 + "\n" + "Address 2: " + address2 + "\nProvince: " + province + "\nPostcode: " + postcode;
        return address;
    }
    
    public String getAddress1(){
        return address1;
    }
    
    public String getAddress2(){
        return address2;
    }
    
    public String getProvince(){
        return province;
    }
    
    public String getPostCode(){
        return postcode;
    }
    
}
