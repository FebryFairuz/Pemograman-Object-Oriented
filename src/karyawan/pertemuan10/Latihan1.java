package karyawan.pertemuan10;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        //Joption pane => Windows dialog
        JOptionPane.showMessageDialog(null,"Hello world");
        
        ImageIcon icon = new ImageIcon("src/karyawan/pertemuan10/icon-feel.png");
        JOptionPane.showMessageDialog(null,"Test gambar","Info",JOptionPane.INFORMATION_MESSAGE,icon);
        //parameter 0 => null
        //parameter 1 => label dialog
        JOptionPane.showOptionDialog(null,"Confirm dialog","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE,null,null,null); //8 parameter yg perlu diisi
        //parameter 0 => null
        //parameter 1 => labeling kata2
        //parameter 2 => Title dari windows dialog
        //parameter 3 => JOptionPane.YES_NO_OPTION => button Yes dan Button NO
        //parameter 4 => Type informari windows dialog
        //parameter 5 => icon 
        //parameter 6 => variabel dlm bentuk array
        //parameter 7 => set value 


        int inputButton = JOptionPane.showConfirmDialog(null, "Apakah kamu suka Burger", "Pilih makanan", JOptionPane.YES_NO_CANCEL_OPTION);
        //yes = 0
        //no  = 1 
        //cancel = 2
        //System.out.println("value:"+inputButton);

        // Scanner input = new Scanner(System.in);
        // String valueInput = input.nextLine();

        String inputDialog = JOptionPane.showInputDialog(null, "Masukan Nama anda:");
        System.out.println("Nama anda adalah "+inputDialog);

        String inputDialog1 = JOptionPane.showInputDialog(null, "Masukan Angka ke-1:");
        String inputDialog2 = JOptionPane.showInputDialog(null, "Masukan Angka ke-2:");

        int jumlah = Integer.parseInt(inputDialog1) + Integer.parseInt(inputDialog2);
        System.out.println("Nilai "+inputDialog1+" + "+inputDialog2+" = "+jumlah);
        JOptionPane.showMessageDialog(null, inputDialog1+" + "+inputDialog2+" = "+jumlah);
        /* 
        #Macam-macam converting untuk isian String#
            Integer.parseInt(...) // convert nilai string ke dalam int
            Double.parseDouble(...) //convert nilai string ke dalam double
            Float.parseFloat(...) //convert nilai string ke dalam float
            Long.parseLong(...) // convert nilai string ke dalam long 
        */

    }
}
