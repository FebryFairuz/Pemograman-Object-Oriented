package com.ibik.app;

import javax.swing.JOptionPane;

public class Latihan2 {
	public static void main(String[] args) {
		int btnValue=JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		String label="";
		if (btnValue==0 ) {
			label="Saya Suka Burger";
		}
		else if (btnValue==1) {
			label="Saya tidak suka Burger";
		}
		else{
			label="Tidak memilih";
		}
		JOptionPane.showMessageDialog(null, label);
	}
}
