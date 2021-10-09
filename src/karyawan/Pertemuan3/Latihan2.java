package karyawan.Pertemuan3;

public class Latihan2 {
    public static void main(String[] args) {
        System.out.println("#REPETION#"); //LOOPING DATA
        // WHILE dan FOR 
        int number1 = 10, number = 20, count = 1 ;
        System.out.println("REPETION - WHILE");
        while (count <= number1) { //sebanyak 10x 
            System.out.println("count="+count);
            count++;
        }
        System.out.println("REPETION - FOR");
        for (count = 1; count < number1; count++) {
            System.out.println("count="+count);
        }
    }    
}
