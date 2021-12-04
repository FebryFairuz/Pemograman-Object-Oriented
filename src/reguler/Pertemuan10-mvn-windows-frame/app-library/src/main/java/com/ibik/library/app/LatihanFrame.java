package com.ibik.library.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LatihanFrame extends JFrame {
	
	private JFrame mainFrame;

	public static void main(String[] args) {
		//initialization object for Windows Frame
		LatihanFrame mainFrame = new LatihanFrame();
		mainFrame.setTitle("First Window");
		mainFrame.setBounds(100,200,300,200);//posisi frame, X,Y,Width,Height
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setResizable(false);//non active maximize
		
		JLabel labelTitle = new JLabel();
		labelTitle.setText("Hello world");
		labelTitle.setBounds(0,0,100,50);
		mainFrame.getContentPane().add(labelTitle); //untuk menambahkan component kedalam frame
		
		JButton button = new JButton();
		button.setText("Click me");
		button.setBounds(10,100,150,20);
		mainFrame.getContentPane().add(button);
		
		
		
		mainFrame.setVisible(true);		
	}

}
