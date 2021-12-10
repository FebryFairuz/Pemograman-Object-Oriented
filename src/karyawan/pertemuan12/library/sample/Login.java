package karyawan.pertemuan12.library.sample;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login {
	
	//membuat sebuah atribute
	private JFrame frmLoginPage;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton btnSignIn;
	private String MyUsername = "456789";
	private String MyPassword = "290292";
	//end atribute

	public static void main(String[] args) {
		//scripting untuk menjalankan argumen swing
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//try catch => error handling yg sudah dibahas dipertemuan sebelumnya
				try {
					//jika benar execute statement dibawah ini
					Login window = new Login(); //initialisasi object class Login
					window.frmLoginPage.setVisible(true); //menandakan bahwa var frmLoginPage dengan tipe JFrame yang akan dijalankan pertama kali
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Error, failed run windows "+e.getMessage());
				}
			}
		});
		//end scripting untuk menjalankan argumen swing
	}

	public Login() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibik_applibrary", "root", "");
        	
			initialize(); //memanggil fungsi initialize
			actionInitialize(); //memanggil fungsi actionInitalize	
			
			conn.close();
		}catch (Exception e) {
        	System.out.println("Error "+e.getMessage());
			JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		}		
	}

	private void initialize() {		
		
		//setting up window frame untuk JFrame
		frmLoginPage = new JFrame(); //init object JFrame untuk variabel frmLoginPage
		frmLoginPage.setTitle("Login Page"); // set title pada window
		frmLoginPage.setResizable(false); // membuat window tidak bisa melakukan resizeable atau maximize window
		frmLoginPage.setBounds(100, 100, 500, 646); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan 
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //action ketika menutup window untuk mengakhiri program 
		frmLoginPage.getContentPane().setLayout(null); //set up layout pada JFrame
		//end setting up JFrame
		
		JLabel labelLogo = new JLabel("logo");
		labelLogo.setBackground(Color.WHITE);
		labelLogo.setIcon(new ImageIcon("D:\\IBIK\\PBO\\2021-2022\\Scripting\\PBO-IBIK-2021\\Pemograman-Object-Oriented\\src\\karyawan\\pertemuan12\\library\\app\\logo-ibik-web.png"));
		labelLogo.setBounds(183, 0, 110, 127);
		frmLoginPage.getContentPane().add(labelLogo);
		
		JLabel labelTitle1 = new JLabel("-Sistem Informasi Perpustakaan-");
		labelTitle1.setBackground(Color.YELLOW);
		labelTitle1.setForeground(Color.BLACK);
		labelTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelTitle1.setBounds(25, 138, 441, 25);
		frmLoginPage.getContentPane().add(labelTitle1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 209, 441, 271);
		frmLoginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LabelUsername = new JLabel("Username");
		LabelUsername.setBounds(29, 38, 363, 14);
		panel.add(LabelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(29, 63, 363, 36);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel LabelPassword = new JLabel("Password");
		LabelPassword.setBounds(29, 122, 363, 14);
		panel.add(LabelPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(29, 147, 363, 36);
		panel.add(textPassword);
				
		btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(303, 208, 89, 36);
		panel.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("(c) 2021 Febri Damatraseta, S.T, M.Kom");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(25, 582, 441, 14);
		frmLoginPage.getContentPane().add(lblNewLabel);
	}
	
	
	private void actionInitialize(){
		btnSignIn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				Login main = new Login();
				main.Validation(username, password);
				
			}
		});		
	}
	
	private void Validation(String username, String password){
		//check apakah parameter terpanggil atau terkirim
		System.out.println("username:"+username+" & password:"+password);
		//end check
		//isEmpty()=> mengecek isian value dari variabel bernilai kosong
		//String username = "";
		//int username = 0;
		//int username = null;
		if( username.isEmpty() || password.isEmpty() ) { //pengecekan nilai username & password kosong
			//System.out.println("Username & password kosong");
			JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda dengan tepat.");			
		
		}else if(!this.isNumber(username)){ //pengecekan nilai value apakah angka
			//penggunaan ! bernilai false
			JOptionPane.showMessageDialog(null, "Harap masukan angka untuk field Username.");
		
		}else if(username.length() >= 10){ //pengecekan nilai digit max 10 angka
			JOptionPane.showMessageDialog(null, "Maximum 10 digit.");
			
		}else if(username.equals(MyUsername) && password.equals(MyPassword)){ //pengecekan berdasarkan nilai username NPM dan password adalah DDMMYY
			//equals() => cara mengecek nilai untuk tipe data String yang memiliki nilai sama.
			//username == "456789" 
			JOptionPane.showMessageDialog(null, "Selamat datang di aplikasi Perpustakaan IBIK");		
		}else { 
			JOptionPane.showMessageDialog(null,"Data yang anda masukan tidak benar"); 
		}
	}
	
	private boolean isNumber(String value){
		return value.matches("-?\\d+(\\.\\d+)?"); //menggunakan REGEX Expression
		//jika nilai value adalah angka maka nilai balik adalah true
		//jika nilai value adalah bukan angka maka nilai balik adalah false
	} 
}
