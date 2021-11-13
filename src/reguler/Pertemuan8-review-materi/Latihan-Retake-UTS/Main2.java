import java.util.Scanner;

//Cara Store nilai sett dan get dengan Atribut

public class Main2 {
    Person p = new Person(); // <= Menggunakan Object Person sbg atribute
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Main2 m = new Main2();
        m.Inputform();
        m.Outputform();    
    }

    public void Inputform(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Form isian data");
        
        System.out.print("Masukan name");
        String Name = myObj.nextLine();
        p.setName(Name);

        System.out.print("Masukan Gender");
        String Gender = myObj.nextLine();
        p.setGender(Gender.charAt(0));

        
        System.out.print("Masukan Birthdate");
        String Birthdate = myObj.nextLine();
        p.setBirthdate(Birthdate);

        System.out.print("Masukan Height");
        String Height = myObj.nextLine();
        p.setHeight( Integer.parseInt(Height));

        System.out.print("Masukan Weight");
        String Weight = myObj.nextLine();
        p.setWeight( Integer.parseInt(Weight));
    }
    
    public void Outputform(){
        
        System.out.println("Output Pengisian : ");
        System.out.println("Name : "+p.getName());
        String type = "";


        if (p.getGender() == 'p' || p.getGender() == 'P') {
            type = "Perempuan";
        } else if(p.getGender() == 'l' || p.getGender() == 'L') {
            type = "Laki-laki";
        } else {
            type = "Tidak diketahui";
        }

        System.out.println("Gender : "+type);
        System.out.println("Birthdate : "+p.getBirthdate());
        System.out.println("Height : "+p.getHeight());
        System.out.println("Weight : "+p.getWeight());
    }
    
}
