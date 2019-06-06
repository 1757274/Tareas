
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.catalina.User;

public abstract class Administration implements User{
    
    private String username;
    private String password;
    private String email;
    private String userAdmin;
    private String userId;    
    boolean login;  
    boolean regist;
    Connection conectar = null;
    
    public Administration(){
    }
    
    public Administration(String username, String password){
        this.username = username;
        this.password = password;
        
    }
   
    public Administration(String username, String password, String email, String userAdmin, String userId){
        this.username = username;
        this.password = password;
        this.userAdmin = userAdmin;
        this.userId = userId;
    
    }

    Administration(String username, String password, String email, String usertype, String userAdmin, String userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void addUsers(){
     
          try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica-8", "root", "");
            Statement stmt = conectar.createStatement();  
            
                          
         
           PreparedStatement prepared =conectar.prepareStatement(password ++ "INSERT INTO user VALUES('"+ ");
           prepared.executeUpdate();

           regist = true;
            
           } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            regist = false;
            
            } finally {
       
                      }
     
     
          try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica-8", "root", "");
            Statement stmt = conectar.createStatement();  
                 
         
           PreparedStatement prepared =conectar.prepareStatement("INSERT INTO admin VALUES('"+ userAdmin +"','"+userId +"')");
           prepared.executeUpdate();

           regist = true;
            
           } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            regist = false;
            
            } finally {
       
                      }
     
     }
    public boolean checkUsersList(){
  
       try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/practica-8", "root", "");
        Statement stmt = conectar.createStatement();  
         
        
        String sql = "SELECT username, password FROM user";
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
         
         String userv = rs.getString("username");
         String passwordv = rs.getString("password");
         
         if (username.equals(userv)){
              if(password.equals(passwordv)){
                    login = true;         
              }
              } else {
              login = false;
                 }
        } 
       
          } catch(SQLException e){
            System.out.println(e.getMessage());
            login = false;
        
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return login;
    }
}
