package karyawan.Pertemuan4.inheritance;

//class turunan / subclass
class Samsung{
    //properties:  public , private dan protected

    //atribute
    public String namaSeries = "Galaxy 20"; // protected => nilai valid
    protected String operatingSystem = "Lolipop";
    private int tipe = 45;

    //function    
    public void Layar(){
        //operatingSystem = "Galaxy Fold";
        System.out.println("Layar amoled");
        System.out.println( "Warna: "+this.Warna() );
    }

    public int Ukuran(int x){
        return x;
    }

    private String Warna(){
        return "PUTIH";
    }
}

class Iphone{
    public void OS(){
        System.out.println("iOS");
    }
}


//main class = Handphone
public class Handphone extends Samsung{ // inheritance
    String namaModel = "Falgship";
    public static void main(String[] args) {
        //initialisi Object
        System.out.println("Class Samsung");
        Samsung s = new Samsung();
        System.out.println("Series:"+ s.namaSeries );
        System.out.println("OS:"+ s.operatingSystem );
        s.Layar();
        int ukuranLayar = s.Ukuran(7);
        System.out.println("Ukurannya : "+ukuranLayar+" inchi");
        //s.Warna();//tidak bisa di panggil karena PRIVATE
        //s.tipe;//tidak bisa dipanggil karena PRIVATE
    }
}

