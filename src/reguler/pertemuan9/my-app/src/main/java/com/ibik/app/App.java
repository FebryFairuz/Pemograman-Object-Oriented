package com.ibik.app;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.JOptionPane;

public class App 
{
	public static void main(String[] args) {
		String label="";
		String inputTextbox = JOptionPane.showInputDialog(null,"Masukan Nama");
		if(inputTextbox.length() > 0) {
			
			int btnValue =JOptionPane.showConfirmDialog(null, "Apakah Kamu Suka Burger","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
			double harga = 38000;
			inputTextbox = inputTextbox.toUpperCase();
			
			if (btnValue==0 ){
				String inputJmlbox = JOptionPane.showInputDialog(null,"Masukan Jumlah Burger");
				if(inputJmlbox.length() > 0){
					if( new App().isNumber(inputJmlbox) ) {
						double jml = harga*Double.parseDouble(inputJmlbox);
						label=inputTextbox+ " mau beli burger MCD\n" +"Jumlah yg dipesan sebanyak " + inputJmlbox+ " burger\n Dengan Total bayar "+new App().formatRupiah(jml);
					}else {
						label = "Harus angka";
					}						
				}else {
					label = "Tidak boleh kosong";
				}
				
			}else if(btnValue==1){
				label=inputTextbox+" tidak suka Burger";
			}else{
				label=inputTextbox+" Tidak memilih";
			}
			
		}else {
			label = "Tidak boleh kosong";
		}
		JOptionPane.showMessageDialog(null, label);
		
	}
	
	public boolean isNumber(String number) {
		if(number == null) {
			return false;
		}
		
		try {
			int d = Integer.parseInt(number);
		} catch (NumberFormatException  e) {
			System.out.println("Error converting "+e.getMessage());
			return false;
		}
		return true;
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
