package karyawan.pertemuan9;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Latihan4 {
    public static void main(String[] args) {
        //latihan JOption Pane
        ImageIcon icon = new ImageIcon("src/karyawan/pertemuan9/icon-feel.png");
        int input = JOptionPane.showConfirmDialog(null, "Are you happy right now ?","Your Feelings Today ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        System.out.println("value:"+input);
    }
}

