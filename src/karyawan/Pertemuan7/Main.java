package karyawan.pertemuan7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import karyawan.pertemuan7.module.Samsung;

public class Main { //main class

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //syntax untuk memberikan inputan kedalam console
        Main m = new Main();
        m.GenerateSamsung(myObj);
    }


    private void GenerateSamsung(Scanner myObj){
        List<Samsung> listSamsung = new ArrayList<Samsung>(); //array data
        System.out.println("\n=Mengisi class Samsung==");
        for (int i = 0; i < 3; i++) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+i);
            System.out.println("------------------------------");

            Samsung s = new Samsung();
            System.out.print("Masukan Merek:");
            String Merek = myObj.nextLine(); //mengambil nilai value dr inputan console
            s.setMerek(Merek);

            System.out.print("Masukan OS:");
            String OS = myObj.nextLine();
            s.setOS(OS);

            System.out.print("Masukan RAM:");
            String RAM = myObj.nextLine();
            s.setRAM( Integer.parseInt(RAM) ); //Integer.parseInt(RAM) => converting nilai String kedalam Integer

            System.out.print("Masukan Type:");
            String Type = myObj.nextLine();
            s.setType(Type);

            System.out.print("Masukan Price:");
            String Price = myObj.nextLine();
            s.setPrice( Double.parseDouble(Price) );  //Double.parseDouble(Price) => converting nilai String kedalam Double

            listSamsung.add(s); //menyimpan setiap value kedalam array

        }
    
        /*listSamsung = [{"smartphone","android 11",4,"galaxy s21",4000000}, 
                    {"smartphone", "android 10", 8, "galaxy fold",5000000}, 
                    {"flagship","android 10",4,"galaxy a21". 2000000} ];
        */

        System.out.println("\n=Mencetak array List Samsung=");
        int index = 0;
        for (Samsung s : listSamsung) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+index);
            System.out.println("------------------------------");
            System.out.println("Merek "+s.getMerek() );
            System.out.println("OS "+s.getOS() );
            System.out.println("RAM "+s.getRAM()+" GB" );
            System.out.println("Type "+s.getType() );
            System.out.println("Price "+s.getPrice() );
            System.out.println("------------------------------");
            index++;
        }
    }
    

    private void GenerateIphone(Scanner myObj){
        //scripting yg sama seperti fungsi GenerateSamsung namun isian class nya berbeda

    }

    
}
