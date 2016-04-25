/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Burin
 */
public class MySQLExecute<E>{
    CSDbDelegate db;
    
    public MySQLExecute(){
        db = new CSDbDelegate("csprog-in.sit.kmutt.ac.th", "3306", "CSC105_G3", "csc105_2014", "csc105");
    }

    public List<E> executeQueryObject(String sql, MySQLMapper<E> objectMapper) {
       System.out.println(db.connect());
       ArrayList<HashMap> list = db.queryRows(sql);
       System.out.println(db.disconnect());
       ArrayList<E> objectList = new ArrayList<E>();
       for(HashMap myInfo : list){
           E object = objectMapper.mapRow(myInfo);
           objectList.add(object);
       }
       return objectList;
    }

    public void excuteQuery(String sql) {
        System.out.println(db.connect());
        db.executeQuery(sql);
        System.out.println(db.disconnect());
    }


    
}
