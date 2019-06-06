/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Diego
 */
public class JDBCConection {
    
    public JDBCConection(){
        
    }
    
    public String conectUser(String nombre){
        String user = null;
        try {
            String url = "jdbc:derby://localhost:9999/LDOO";
            String username = "ldoo";
            String password = "ldoo";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM LDOO.USERS");
                
                while (rs.next()) {
                    if (rs.getString("USERNAME").equals(nombre))
                        user = rs.getString("USERNAME");
                }
                
                rs.close();
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return user;
    }
    
    public String conectPassword(String contra){
        String pass = null;
        try {
            String url = "jdbc:derby://localhost:9999/LDOO";
            String username = "ldoo";
            String password = "ldoo";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM LDOO.USERS");
                
                while (rs.next()) {
                    if (rs.getString("PASSWORD").equals(contra))
                        pass = rs.getString("PASSWORD");
                }
                
                rs.close();
                statement.close();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return pass;
    }
    
    public void conect(String user, String password){
        conectUser(user);
        conectPassword(password);
    }
    
    public void addUser(String user, String pass){
        try {
            String url = "jdbc:derby://localhost:9999/LDOO";
            String username = "ldoo";
            String password = "ldoo";

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO LDOO.USERS(USERNAME, PASSWORD) VALUES('" + user + ", '"+ pass +")");

            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
