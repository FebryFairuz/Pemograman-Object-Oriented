package karyawan.Pertemuan5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Handphone {
    public static void main(String[] args) {
        File file = new File("D:/IBIK/PBO/2021-2022/Scripting/PBO-IBIK-2021/src/karyawan/Pertemuan5/DaftarHPSamsung.txt");//memanggil file DaftarHPSamsung.txt di dalam directori;
        FileInputStream fis = null; //object fis bertipe FileInputStream berisi nilai null
        BufferedInputStream bis = null;//object bis bertipe BufferedInputStream berisi nilai null
        DataInputStream dis = null;//object dis bertipe DataInputStream berisi nilai null
        List<Samsung> listHP = new ArrayList<Samsung>();

        try {//melakuan business logic
            fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            while(dis.available() != 0){
                //memecah text perbaris menjadi beberapa kolom sesuai dengan pemisah koma
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Samsung s = new Samsung();
                s.setMerek(data[0]);
                s.setOS(data[1]);
                s.setHarga(data[2]);

                listHP.add(s);
            }

        } catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
        }

        //memanggil keluaran array
        int number = 1;
        for(Samsung s : listHP){
            System.out.println("=======["+number+"]=========");
            System.out.println("Merek: "+s.getMerek());
            System.out.println("OS: "+s.getOS());
            System.out.println("Harga: "+s.getHarga());
            number++;
        }
    }
}
