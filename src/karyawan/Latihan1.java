package karyawan;

public class Latihan1 { //class name
    //role name class:
    /*
    # 1. Filename dan class name harus sama
    2. Diawali dengan huruf besar
    3. Dipisahkan dengan Huruf besar / underscore, tidak bisa diawali dengan Angka
    contoh: HandphoneVersi2, Handphone_Versi2, H1anphone234
    */

    public static void main(String args[]){ //fungtion utama untuk menjalankan program java
        //mencetak string dalam console
        System.out.println("hello"); // mencetak sebuah string didalam console - println => baris baru
        System.out.print("hai"); // mencetak dalam 1  baris
        System.out.print("aku\n");
        
        //Attribute
        //Contoh tipe data:
        //# int, float, long, double, String, char, 
        //Contoh variabel:
        //format: tipe_data[space]nama_variabel
        int angka, number_; //contoh variabel dengan tipe data yg sama. Pemisah tanda koma (,)
        float Angka_Desimal;
        long ANGKAratusan;
        //inisialisasi atribut
        long number = 100000;
        String kata = "ini adalah pertemuan ke 3";
        //error inisialisasi,
        //int angka = "1"; // value dimiliki adalah string
        double angka1 = 1.56; //tanda titik untuk menandakan bahwa value dalam bentuk desimal

        System.out.println("=Contoh Atribute=");
        System.out.println("Variabel number:"+number); //tanda panah => tanda untuk menyatukan antar variabel ke dalam print/string
        System.out.println("Variabel kata:"+kata);
        System.out.println("Variabel angka:"+angka1);

        //Operator 
        // tambah (+)
        // perkurangan (-)
        // pembagian ( / )
        // perkalian (*)
        // modulus (%)

        System.out.println("=Contoh Operator=");
        int x = 1, y= 2;         
        int hasil = x + y;
        System.out.println("Penjumlahan "+x+"+"+y+"="+ hasil );
        System.out.println("Pengurangan "+x+"-"+y+"="+ (x-y) );
        hasil = y / x;
        System.out.println("Pembagian "+x+"/"+y+"="+ hasil );
        hasil = y * x;        
        System.out.println("Perkalian "+x+"*"+y+"="+ hasil );
        hasil = y % x;        
        System.out.println("Modulus "+x+"%"+y+"="+ hasil );
        
    }
}
