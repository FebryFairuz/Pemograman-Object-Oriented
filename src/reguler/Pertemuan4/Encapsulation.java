package reguler.Pertemuan4;

public class Encapsulation {
    public String nama;
    public int ukuran;
    public int memori;
    
    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getMemori() {
        return memori;
    }

    public void setMemori(int memori) {
        this.memori = memori;
    }   

    public void setNama(String x){
        this.nama = x;
    }

    public String getNama(){
        return this.nama;
    }


}
