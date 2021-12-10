package karyawan.pertemuan12.library.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	private Connection koneksi;
	
	public Connection connect(){
		//untuk koneksi ke driver
        try{
        	String namadriver = "com.mysql.jdbc.Driver"; 
            Class.forName(namadriver);
            System.out.println("berhasil load driver"); 
        }catch(ClassNotFoundException cnfe){
            System.out.println("Tidak ada Driver "+cnfe);
        }
        //untuk koneksi ke database
        try{
            String url="jdbc:mysql://localhost/ibik_applibrary";
            koneksi=DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi");
        }catch(SQLException se){
            System.out.println("Gagal koneksi "+se);
        }
        
        try {
			koneksi.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return koneksi;
	}
	
}
