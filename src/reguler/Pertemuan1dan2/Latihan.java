//package reguler;

/*
Aturan pembuatan class:
1. Nama file dengan nama class harus sama.
2. Penamaan file, diawali dengan huruf Besar dan jika memiliki tingkatan penamaan itu tdk boleh menggunakan [space].
Contoh:
Latihan Kesatu => Latihan_kesatu / LatihanKesatu / Latihankesatu
*/
public class Latihan { //super class
    
    public static void main(String args[]){ //fungtion utama untuk menjalankan / mengeksekusi operation/argumen
        System.out.print("Hello world"); //=> output ke dalam console.  mencetak dalam 1 baris yang sama    
        //terdiri dari tipe data dan variabel. Format tipe_data[space]nama_variabel
        //Tipe data : int, float, double, long, String, char, array
        //Variabel, format :
        //1. penamaan frasa bertingkat tdk boleh menggunakan space, menggunakan tanda underscore (_) ataupun digabung menjadi 1 kata .
        //2. tidak boleh diawali dengan angka
        //Contoh :
        // 1angka => tdk boleh
        // angka kesatu => tdk boleh
        // angka1 => boleh
        // angka_kesatu atau angkaKesatu atau AngkaKesatu atau ANGKAkeSATU  => boleh

        //Inisialisai variabel
        //tdk boleh memiliki nama variabel yang sama walau dgn tipe data yang berbeda
        int x = 0 , c = 2; //tanda koma => sebagai pemisah antar variabel dengan tipe data yang sama
        float y = 5;
        double z =1.62588 , d , f, g;
        long a = 100000;
        String b = "Ini adalah pertemuan ke tiga";
        char o = 'a';
        boolean test = true; //tipedata boolean hanya dua : true or false

        //contoh inisialisai variabel yang salah ?
        //double k = "0.56"; // ouputnya bilangan desimal/numberic yang jumlah banyak <> value yg dimiliki adalah String.
        //int k = 5.6;

        System.out.println("\n#Inisialisasi variabel#"); // diperuntukan mencetak output dengan/ memiliki break line
        System.out.println("Variabel x=" + x ); //tanda plus (+) digunakan sbg tanda penggabung antar variabel
        System.out.println("Variabel y=" + y );
        System.out.println("Variabel z=" + z + " dan a="+ a);
        System.out.println("Variabel b=" + b );
        System.out.println("Variabel o=" + o );
        System.out.println("Variabel x dan c=" + x + c ); // 0+2 = 2
        System.out.println("Variabel x + c =" + (x + c) ); // 0+2 = 2

        //Simbol Operator
        int hasil = x * c ;
        System.out.println("x * c = " + hasil );
        hasil = x - c;
        System.out.println("x - c = " + hasil );
        long hasil2 = a % c; 
        System.out.println("a % c = " + hasil2 );


        //selection
        System.out.println("#Contoh selection#");
        test = false;
        if(test){ //true
            System.out.println("hasilnya benar");
        }else if(!test){ //false
            System.out.println("hasilnya salah");
        }else{
            System.out.println("tidak diketahui");
        }

    }

    public static void test(){
        System.out.print("Hello world");
    }



}

