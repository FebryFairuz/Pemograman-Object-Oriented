package com.ibik.library.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	public JFrame mainFrame;
	
		public static void main(String[] args) {
			Login mainFrame = new Login();
			mainFrame.setTitle("Login");
			mainFrame.setBounds(0,0,400,300);
			mainFrame.getContentPane().setLayout(null);
			
			mainFrame.fetchComponent(mainFrame);
			
			mainFrame.setVisible(true);				
		}
		
		
		public void fetchComponent(JFrame currentFrame){
			JLabel labelUsername = new JLabel();
			labelUsername.setText("Username");
			labelUsername.setBounds(10,0,100,25);			
			currentFrame.getContentPane().add(labelUsername);
			
			JLabel labelPassword = new JLabel();
			labelPassword.setText("Password");
			labelPassword.setBounds(10,47,100,25);
			currentFrame.getContentPane().add(labelPassword);
			
			
			final JTextField textUsername = new JTextField();
			textUsername.setBounds(100,0,100,25);			
			currentFrame.getContentPane().add(textUsername);			
			
			final JPasswordField textPassword = new JPasswordField();
			textPassword.setBounds(100,50,100,25);
			currentFrame.getContentPane().add(textPassword);
			
			JButton buttonLogin = new JButton();
			buttonLogin.setText("Login");
			buttonLogin.setBounds(100,100,100,20);
			currentFrame.getContentPane().add(buttonLogin);
			
			//memberikan action click
			buttonLogin.addActionListener(new ActionListener() {
				@Override //annotation untuk menandakan kepemilikan fungsi yg sama lebih dari 1
				public void actionPerformed(ActionEvent e) {
					
					String ValueUsername = textUsername.getText();
					String ValuePassword = String.valueOf(textPassword.getPassword());
					System.out.print("Username:"+ValueUsername);
					System.out.print("Password:"+ValuePassword);
					
					// EQUALS DI STRING == "..." ATAU .equals()
					if (ValueUsername.equalsIgnoreCase("PBO.2021") && ValuePassword.equalsIgnoreCase("041221")) {
						JOptionPane.showMessageDialog (null,"Welcome xxxx");
					}else {
						JOptionPane.showMessageDialog (null,"Failed Username & Password");	
					}
				
										
				}				
			});
			//end event click
			
			JButton buttonCancel = new JButton();
			buttonCancel.setText("Cancel");
			buttonCancel.setBounds(0,100,100,20);
			currentFrame.getContentPane().add(buttonCancel);
			
			
			

		}
		
		
		
			
}
