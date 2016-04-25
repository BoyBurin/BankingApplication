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
public class Name {
    private String name;
    private String middle_name;
    private String surname;
    
    public Name(String name, String middle_name, String surname){
        this.name = name;
        this.middle_name = middle_name;
        this.surname = surname;
    }
    
    public Name(String name, String surname){
        this.name = name;
        this.middle_name = "";
        this.surname = surname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMiddleName(String middle_name){
        this.middle_name = middle_name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String toString(){
        String myName = name + " " + middle_name + " " + surname;
        return myName;
    }
}
