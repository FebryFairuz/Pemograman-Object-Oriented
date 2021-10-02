//package reguler;

public class Handphone {

    //ATRIBUTE
        public int layar;
        public int camera;
        public String bater;
    //END OF ATRIBUTE

    public static void main(String args[]){
        menelpon();
        System.out.println("Ini contoh fungsi tipe data INT");
        System.out.println( berfoto() );
        int hasil = berfoto();        
        System.out.println(hasil);
        //PARAMETER
        System.out.println("Ini contoh fungsi dengan parameter");
        int x = 8, y=2;
        System.out.println( engine(x, y) ); // engine(8, 2)
        System.out.println( jenis(1) );
    }

    //METHOD / FUNGTION
        //Aturan:
        //Format : public static tipe_data namaFungsi()

        public static void menelpon(){ // tipe data ini hanya bisa menampilkan keseliruhan statement dan argumen 
            System.out.println("Ini adalah contoh fungsi tipe data VOID");
            int x = 2;
            int z = 3;
            System.out.println( "hasil = " + (x+z) );
        }

        public static int berfoto(){ // seting fungsi tipe data int
            int x = 5;
            int z = 4;
            return x+z; // harus int
        }

        public static double engine(int x, int y){ //x = 8 dan y=2
            return x * y ;
        }

        public static String jenis(int name){ //x = 8 dan y=2
            String hasil = ""+name;
            return hasil;
        }
        

    //END OF METHOD / FUNGTION


}
