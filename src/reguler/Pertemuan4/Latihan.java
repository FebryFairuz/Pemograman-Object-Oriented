package reguler.Pertemuan4;


class Handphone{ // main class
    public String nama = "Flagship";
    public int size = 6;
    public double memori = 32.5;

    public void Layar(){
        System.out.println("Layar Amoled");
    }

    public int Ukuran(){
        return this.size;
    }

    public double MemoriInternal(){
        return this.memori;
    }
}

class Samsung extends Handphone{ //sub class
    public String jenis = "Galaxy Fold";

    public void Layar(){
        System.out.println("Layar Lipat");
    }

    public String OperatingSystem(String x){
        return x;
    }
}


class Iphone extends Handphone{    
    public String OperatingSystem(String x){
        return x;
    }
}

public class Latihan {
    public static void main(String[] args) {
        //inisialisasi object
        Handphone h = new Handphone();//init object
        System.out.println("Class HANDPHONE - main class");  
        h.Layar();
        int ukuran = h.Ukuran();
        System.out.println("Ukuran HP:"+ukuran+" inchi");
        double memori = h.MemoriInternal();        
        System.out.println("Memori Internal:"+memori+" GB");
        System.out.println("=====================================");
        System.out.println("Class SAMSUNG - Subclass");
        Samsung s = new Samsung(); //init object
        System.out.println("Jenis HP:"+s.nama);
        s.Layar();
        ukuran = s.Ukuran();
        System.out.println("Ukuran HP:"+ukuran+" inchi");
        memori = h.MemoriInternal();        
        System.out.println("Memori Internal:"+memori+" GB");
        String operatingSystem = s.OperatingSystem("Android");
        System.out.println("OS :"+operatingSystem);
        System.out.println("Jenis HP :"+s.jenis);
        //h.OperatingSystem("Lolipop"); //tidak bisa mengakses komponen yg ada di subclass

        Iphone i = new Iphone();
        System.out.println("=====================================");
        System.out.println("Class IPHONE - Subclass");
        i.Layar();
        ukuran = i.Ukuran();
        System.out.println("Ukuran HP:"+ukuran+" inchi");
        memori = h.MemoriInternal();        
        System.out.println("Memori Internal:"+memori+" GB");
        operatingSystem = i.OperatingSystem("iOS");
        System.out.println("OS :"+operatingSystem);


        System.out.println("=====================================");
        System.out.println("Class Encapsulation");
        Encapsulation e = new Encapsulation();
        e.setNama("Galaxy 20");
        e.setMemori(60);
        e.setUkuran(4);

        System.out.println(e.getNama());
        System.out.println(e.getMemori());
        System.out.println(e.getUkuran());
        
    }
}
