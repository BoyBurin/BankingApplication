/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.model.BankAccount;

/**
 *
 * @author Burin
 */
public class MySQLBankingFactory implements BankingFactory {

    @Override
    public DAOEmployeeAccount getDAOEmployee() {
        MySQLMapper<EmployeeAccount> myMapper = new MySQLEmployeeMapper();
        MySQLExecute<EmployeeAccount> myExcute = new MySQLExecute<EmployeeAccount>();
        MySQLDAOEmployeeAccount myDAO = new MySQLDAOEmployeeAccount(myMapper, myExcute);
        return myDAO;
    }

    @Override
    public DAOCustomerAccount getDAOCustomer() {
        MySQLMapper<CustomerAccount> myMapper = new MySQLCustomerMapper();
        MySQLExecute<CustomerAccount> myExcute = new MySQLExecute<CustomerAccount>();
        MySQLDAOCustomerAccount myDAO = new MySQLDAOCustomerAccount(myMapper, myExcute);
        return myDAO;
    }

    @Override
    public DAOTransaction getDAOTransaction() {
        MySQLMapper<Transaction> myMapper = new MySQLTransactionMapper();
        MySQLExecute<Transaction> myExcute = new MySQLExecute<Transaction>();
        MySQLDAOTransaction myDAO = new MySQLDAOTransaction(myMapper, myExcute);
        return myDAO;
    }
    
}
