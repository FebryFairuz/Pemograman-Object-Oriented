package karyawan.Pertemuan3;

public class Latihan {
    public static void main(String[] args) {
        System.out.println("#SELECTION#");
        //IF ELSE DAN Switch case
        System.out.println("#SELECTION - IF ELSE#");
        int number1 = 10, number2 = 30;
        if(number1 < number2){
            System.out.println(number1+" lebih kecil dari "+number2);
        }else if(number1 > number2){
            System.out.println(number1+" lebih besar dari "+number2);
        }else{
            System.out.println("tidak diketahui");
        }

        //short if => 1 kondisi/statement
        System.out.println("#SELECTION - IF ELSE - Short IF#");
        //short if format : ( statement ) ? nilai_true : nilai_false;
        boolean result = (( number1 < number2 ) ? true : false );
        int result2 = (( number1 < number2 ) ? 1 : 0 );
        System.out.println("Short IF var result: "+result);
        System.out.println("Short IF var result2: "+result2);

        if(result){ // true
            System.out.println("benar");
        }else if(!result){  // false
            System.out.println("salah");
        }

        System.out.println("Selection - SWITCH CASE");
        switch (number2) {
            case 10:
                System.out.println("salah");
                break;        
            case 20:
                System.out.println("Benar");    
                break;
            default:
                System.out.println("Tidak diketahui");
                break;
        }

    }
}
