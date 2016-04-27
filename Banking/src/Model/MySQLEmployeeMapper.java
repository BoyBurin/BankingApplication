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
public class MySQLEmployeeMapper implements MySQLMapper<EmployeeAccount> {

    public EmployeeAccount mapRow(HashMap info) {
        int id = Integer.parseInt((String)(info.get("id")));
        String name = (String)info.get("name");
        String middle_name = (String)info.get("middle_name");
        String surname = (String)info.get("surname");
        String username = (String)info.get("username");
        String password = (String)info.get("password");
        String branch = (String)info.get("branch");
        Name emp_name = new Name(name, middle_name, surname);
        EmployeeAccount myEmployee = new EmployeeAccount(username, password, emp_name, id, branch);
        return myEmployee;
    }

    
}
