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

    public EmployeeAccount mapRow(HashMap objectMapper) {
        int id = Integer.parseInt((String)(objectMapper.get("id")));
        String name = (String)objectMapper.get("name");
        String middle_name = (String)objectMapper.get("middle_name");
        String surname = (String)objectMapper.get("surname");
        String username = (String)objectMapper.get("username");
        String password = (String)objectMapper.get("password");
        Name emp_name = new Name(name, middle_name, surname);
        EmployeeAccount myEmployee = new EmployeeAccount(username, password, emp_name, id);
        return myEmployee;
    }

    
}
