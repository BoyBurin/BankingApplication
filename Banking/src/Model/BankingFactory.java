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
public interface BankingFactory {
    
    public DAOEmployeeAccount getDAOEmployee();
    public DAOCustomerAccount getDAOCustomer();
    public DAOTransaction getDAOTransaction();
    
}
