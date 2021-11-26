package com.ibik.app;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;

public class Latihan4 {
	public static void main(String[] args) {
		String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		int btnValue =JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
		double harga = 38000;
		inputTextbox = inputTextbox.toUpperCase();
		String label="";
		if (btnValue==0 ){
			String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
			double jml = harga*Double.parseDouble(inputJmlbox);
			label=inputTextbox+ " mau beli burger MCD\n" +"Jumlah yg dipesan sebanyak " + inputJmlbox+ " burger\n Dengan Total bayar "+new Latihan4().formatRupiah(jml);
		}else if(btnValue==1){
			label=inputTextbox+" tidak suka Burger";
		}else{
			label=inputTextbox+" Tidak memilih";
		}
		JOptionPane.showMessageDialog(null, label);
	}
	
	public String formatRupiah(double nominal){		
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
		return kursIndonesia.format(nominal);
	}
}
