/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.connectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ajax2
 */

/**
 * Para este metodo es necesario usar el conector 
 * mysql-connector-java-5x-bin.jar (Donde X es cualquier versión en este caso 5.0.8).
 * Este se deberá colocar en el appRooot/libraries (o sea crear la carpeta libraries en el root de
 * la aplicacion). De esta forma el conector siempre estara disponible.
 * Luego click derecho a al proyecto->properties->libraries->add JAR/Folder y agregamos el conector.
 */
public class connectDB {
    private static Connection conn;
    //private static final String url = "jdbc:mysql://localhost:3306/dr_demo";
    private static final String url = "jdbc:sqlite:db/database.db";
    //private static final String user = "root";
    //private static final String pass = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        if(conn !=null && !conn.isClosed())
            return conn;
            connect();
            return conn;
    }
    
    public static Connection connect() throws SQLException{
	try {
            Class.forName("org.sqlite.JDBC").newInstance();
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
	} catch(ClassNotFoundException | InstantiationException | IllegalAccessException cnfe) {
            System.err.println("Error: "+cnfe.getMessage());
	}
            conn = DriverManager.getConnection(url);
            return conn;
	}
}
