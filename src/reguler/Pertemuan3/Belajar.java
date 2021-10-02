package reguler.Pertemuan3;

public class Belajar { // sebuah class namanya Belajar

    public static void main(String args[]){ // fungsi utama dalam program java
        
        //variabel         
        int number1, number2=20, result; // tipe data integer
        boolean number; //tru or false
        String hasil;
        boolean hasil2;


        number1 = 10;
        //operating
        result = number1 + number2;
        //mencetak kedalam system console
        System.out.println("Operating penjumlahan "+number1+" + "+number2+" = "+result ); 
        System.out.println("Operating pengurangan "+number2+" - "+number1+" = "+ ( number2 - number1 ) ); 

        number = true;
        
        System.out.println("=SELECTION=");
        //selection         
        if(!number){ // !variabel boolean => false  => if(false)          
            System.out.println("Mencetak hasil FALSE"); 
        }else{
            System.out.println("Mencetak hasil TRUE"); 
        }

        //short if
        hasil = ( number1 > number2 ) ? "TRUE" : "FALSE" ; //return string
        hasil2 = ( number1 > number2 ) ? true : false ; //return boolean
        result = ( number1 > number2 ) ? 1 : 0 ; //return integer
        //sama dengan syntax seperti dibawah ini untuk short if
        /*if(number1 > number2){
            hasil = "TRUE";
        }else{
            hasil = "FALSE";
        }*/
        System.out.println("#Contoh IF ELSE#");
        System.out.println("Hasil perbandingan antara "+number1+" lebih besar dari "+number2+" adalah "+hasil);
        System.out.println("Hasil perbandingan antara "+number1+" lebih besar dari "+number2+" adalah "+hasil2);
        System.out.println("Hasil perbandingan antara "+number1+" lebih besar dari "+number2+" adalah "+result);
        
                
        System.out.println("#Contoh SWITCH CASE#");
        switch (number1) {
            case 10: // number1 == 10
                hasil ="Benar nilainya adalah 10";  
                System.out.println("Hasil selection variabel number1 adalah "+10);
                break;        
            case 20: // number1 == 20
                hasil = "Benar nilainya adalah 20";        
                break;     
            default:
                hasil = "Nilai tidak diketahui";        
                break;
        }
        System.out.println("Hasil selection variabel number1 adalah "+hasil);

        System.out.println("=REPETETION=");
        System.out.println("#Contoh while#");
        int count = 1;
        while (count < number1) { // melakukan looping sebanyak 10x.
            System.out.println("Count "+ count);
            count++; // count + 1
        }
        count = 1;
        System.out.println("#Contoh while#");
        while (count <= number1) { // melakukan looping sebanyak 10x.
            System.out.println("Count = "+ count);
            count++; // count + 1
        }   
        count = 1;
        System.out.println("#Contoh For#");
        for (int i = count; i < number1; i++) {
            System.out.println("i = "+ i);
        }
    }
}
