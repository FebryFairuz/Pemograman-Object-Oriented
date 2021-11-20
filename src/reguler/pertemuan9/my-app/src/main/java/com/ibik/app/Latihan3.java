package com.ibik.app;

import javax.swing.JOptionPane;

public class Latihan3 {
	public static void main(String[] args) {
	String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		int btnValue=JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		String label="";
		if (btnValue==0 ) {
			label=inputTextbox+" Suka Burger";
		}
		else if (btnValue==1) {
			label=inputTextbox+" tidak suka Burger";
		}
		else{
			label=inputTextbox+" Tidak memilih";
		}
		JOptionPane.showMessageDialog(null, label);
	}
}
