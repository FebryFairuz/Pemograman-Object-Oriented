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
            //JOptionPane.showMessageDialog(this, "Berhasil Diinput", "Berhasil", JOptionPane.INFORMATION_MESSAGE); 
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
        //JOptionPane.showMessageDialog(null,”Gagal koneksi…MySQL server belum aktif”);
        }
        return koneksi;
	}
	
}
