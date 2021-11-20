package com.ibik.app;

import javax.swing.JOptionPane;

public class Latihan5 {

	public static void main(String[] args) {
		String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		
		Latihan5 myLatihan = new Latihan5();
		
		while (inputTextbox.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Error!! Field tidak boleh kosong");
			inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		}

		int btnValue =JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		double harga = 38000;
		inputTextbox = inputTextbox.toUpperCase();
		String label="";
		if (btnValue==0){
			String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
			while (myLatihan.isNumber(inputJmlbox) == false) {
				JOptionPane.showMessageDialog(null, "Field harus angka");
				inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
			}
			double jml = harga*Double.parseDouble(inputJmlbox);
			label = inputTextbox + " mau beli burger MCD\n" +"Jumlah yg dipesan sebanyak " + inputJmlbox+ " burger\n Dengan Total bayar "+new Latihan4().formatRupiah(jml);
		}else if(btnValue == 1){
			label = inputTextbox + " tidak suka Burger";
		}else{
			label = inputTextbox + " Tidak memilih";
		}
		JOptionPane.showMessageDialog(null, label);
	}
	
	public boolean isNumber(String input) {
		
		try {
			Double x = Double.parseDouble(input);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
}