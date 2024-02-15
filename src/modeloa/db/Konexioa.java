package modeloa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Konexioa {

    static String respuesta;

    public static Connection konektatua;
    static Statement sta;
    static ResultSet res;
    
    public static void konexioa() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3307/db_ElorrietaZinemaT4";
            String user = "root";
            String pass = "";

            konektatua = DriverManager.getConnection(url, user, pass); 
            System.out.println("konektatuta");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void konexioaExit() {
    	try {
			//res.close();
			//sta.close();
	        konektatua.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static void objetuakHasi() {
    	
    }
    
}
