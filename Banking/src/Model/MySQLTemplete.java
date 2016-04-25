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
public abstract class MySQLTemplete<E> {
    private MySQLMapper<E> map;
    private MySQLExecute<E> templete;
    
    public MySQLTemplete(MySQLMapper<E> map){
        this.map = map;
        templete = new MySQLExecute<E>();
    }
    
    protected MySQLMapper<E> getMapper(){
        return map;
    }
    
    protected MySQLExecute<E> getExecute(){
        return templete;
    }
    
}
