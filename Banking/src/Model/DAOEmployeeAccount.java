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
public interface DAOEmployeeAccount {

    
    public abstract int countEmployee();

    public abstract List<EmployeeAccount> getAllEmployee();

    public abstract List<EmployeeAccount> getListByMiddleName(String middle_name);

    public abstract List<EmployeeAccount> getListByName(String name);

    public abstract List<EmployeeAccount> getListBySurName(String surname);

    public abstract EmployeeAccount getOneEmployee(String username);

    public abstract void updateEmployeePassword(EmployeeAccount updateBalance);
    
}
