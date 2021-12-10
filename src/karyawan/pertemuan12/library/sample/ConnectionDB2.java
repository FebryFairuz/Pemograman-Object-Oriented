package karyawan.pertemuan12.library.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB2 {
	private Connection koneksi;
	public Statement stt;
	
	public Connection connect(){
		//untuk koneksi ke driver
        try{
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibik_applibrarys", "root", "");
            
        }catch(ClassNotFoundException cnfe){
            System.out.println("Tidak ada Driver "+cnfe);
            cnfe.printStackTrace();
        } catch (SQLException e) {
        	System.out.println("Error lah"+e.getMessage());
			e.printStackTrace();
		}
        
        return koneksi;
        
        
	}
	
}
