package com.ibik.windows.app;

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
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLoginPage;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton btnSignIn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		actionInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setTitle("Login Page");
		frmLoginPage.setResizable(false);
		frmLoginPage.setBounds(100, 100, 500, 646);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		
		JLabel labelLogo = new JLabel("logo");
		labelLogo.setBackground(Color.WHITE);
		labelLogo.setIcon(new ImageIcon("D:\\IBIK\\PBO\\2021-2022\\Scripting\\PBO-IBIK-2021\\src\\reguler\\pertemuan9-first-project-maven\\my-app\\src\\main\\java\\com\\ibik\\windows\\images\\logo-ibik-web.png"));
		labelLogo.setBounds(183, 0, 110, 127);
		frmLoginPage.getContentPane().add(labelLogo);
		
		JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan");
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
		LabelUsername.setBounds(29, 38, 72, 14);
		panel.add(LabelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(29, 63, 363, 36);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel LabelPassword = new JLabel("Password");
		LabelPassword.setBounds(29, 122, 46, 14);
		panel.add(LabelPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(29, 147, 363, 36);
		panel.add(textPassword);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(303, 208, 89, 36);
		panel.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("(c) 2020 Febri Damatraseta, S.T, M.Kom");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(25, 582, 441, 14);
		frmLoginPage.getContentPane().add(lblNewLabel);
	}
	
	
	private void actionInitialize(){
		btnSignIn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				System.out.println("username:"+username);
				System.out.println("password:"+password);
				JOptionPane.showMessageDialog(null, "username:"+username+"\npassword:"+password);
			}
		});
		
	}
}
