package reguler.Pertemuan3;

//Belajar mengenai isialisasi sebuah PROPERTIES

public class Belajar2 {
    
    //Properties
    private String hasil; //"Pemograman Object Oriented"
    public Integer number1;

    public static void main(String args[]){
        //contoh penggunaan properties variabel hasil
        Belajar2 test = new Belajar2(); //Object
        test.setName("Pemograman Object Oriented"); //inisialisasi value / set value
        String hasil = test.getName();
        System.out.println(hasil);
    }

    //setter dan getter
    public void setName(String x){ //sett value
        this.hasil = x;
    }

    public String getName(){ //get = mengambil nilai value yg sudah di set
        return this.hasil;
    }
    //end setter dan getter
    
}
