/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect.connectDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ajax-32
 */
public final class Users {
    private Connection conexion;
    private String username;
    private String password;
    private String SqlString;
    
    public Users(){}
    public Users(String sql){
        if(sql != null){
            this.setSqlString(sql);
            this.getUser();
        }
    }
        
    private void getUser(){
        try {
            conexion = connectDB.connect();
            Statement s = conexion.createStatement(); 
            try (ResultSet rs = s.executeQuery (this.getSqlString())) {
                while (rs.next()){
                    this.setUsername(rs.getString("username"));
                    this.setPassword(rs.getString("password"));
                }
             
            } catch(Exception ie) {
                System.err.println("Error: "+ie.getMessage());
            }            
        
        } catch(Exception ie) {
            System.err.println("Error: "+ie.getMessage());
        }        
    }

    public void setSqlString(String SqlString){
        this.SqlString = SqlString;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    private String getSqlString(){
        return SqlString;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
      
}
