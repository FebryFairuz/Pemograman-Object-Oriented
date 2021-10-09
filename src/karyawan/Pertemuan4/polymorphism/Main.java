package karyawan.Pertemuan4.polymorphism;

class Handphone{ //main class
    public String nama = "Handphone Flagship";
    public int camera = 64;
    private double memori = 32.5;

    public void Layar(){
        System.out.println("Layar Amoled");
    }

    public int CameraBelakang(){
        return this.camera;
    }

    public double MemoriInternal(){
        return this.memori;
    }

}

class Samsung extends Handphone{ //subclass => inheritance 

    public void Layar(){
        System.out.println("Layar Lipat");
    }

    public String Engine(){
        return "Andorid";
    }

}

class Iphone extends Handphone{ //subclass => inheritance 
    
    public String Engine(){
        return "iOS";
    }

}


public class Main {
    public static void main(String[] args) {
        //initialisasi object 
        Handphone h = new Handphone(); //main class
        Samsung s = new Samsung();
        Iphone i = new Iphone();
        
        //call main class
        //h.Engine(); =? tdk bisa memanggil atribut / fungsi yg dimiliki sub class
        
        System.out.println("Class Samsung ");
        s.Layar();
        System.out.println("Camera = "+ s.CameraBelakang() + "Megapixel" );
        System.out.println("Memori Internal = "+ s.MemoriInternal() );
        System.out.println("Engine = "+ s.Engine() );
        System.out.println("===========================");
        System.out.println("Class Iphone ");
        i.Layar();
        System.out.println("Camera = "+ i.CameraBelakang() );
        System.out.println("Memori Internal = "+ i.MemoriInternal() );
        System.out.println("Engine = "+ i.Engine() );
        
    }
}
