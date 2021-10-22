package karyawan.Pertemuan6;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import karyawan.Pertemuan6.module.Samsung;


public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("--Fetching data Samsung--");
        m.GenerateSamsung("D:/IBIK/PBO/2021-2022/Scripting/PBO-IBIK-2021/src/reguler/Pertemuan6/database/DaftarSamsung.txt");

        System.out.println("--Fetching data Iphone--");
        m.GenerateIphone();
    }


    public void GenerateSamsung(String path){
        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Samsung> listSamsung  = new ArrayList<Samsung>();

        try {
            fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Samsung s = new  Samsung();
                s.setType(data[0]);
                s.setOS(data[1]);
                s.setRAM(Integer.parseInt(data[2]));
                s.setMerek(data[3]);
                s.setPrice(Double.parseDouble(data[4]));
                
                listSamsung.add(s);
            }

        } catch (Exception e) {
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+e.getMessage());
        }

        for(Samsung s : listSamsung){
            System.out.println("======================");
            System.out.println("Type : "+s.getType());
            System.out.println("OS : "+s.getOS());
            System.out.println("RAM : "+s.getRAM());
            System.out.println("Merek : "+s.getMerek());
            System.out.println("Price : "+s.getPrice());
        }
    }


    public void GenerateIphone(){
        //did the same thing
    }

    
}
