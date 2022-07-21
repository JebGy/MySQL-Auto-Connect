/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autoConnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author JebGy
 */
public class Connect {
    Connection cn;
    
    /**
     * 
     * @param URL Url of your DataBase
     * @param USER User of the DataBase
     * @param PASSWORD User Password
     * @return Return the connection
     */
    public Connection autoConnect(String URL, String USER, String PASSWORD){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Done, You are connected :D. Support by MySQL:Auto-Connect");
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }
        return cn;
    }
}
