import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public List <Person> ListPerson = new ArrayList<Person>();

    public static void main(String[] args) {
        
        Main m = new Main();
        /*int jmlData = 3;
        for(int i=0; i<jmlData; i++){
            System.out.println("Data ke "+i); 
            Person Inputdata=m.Inputform();
            m.ListPerson.add(Inputdata);
            System.out.println(" ================"); 
        } 
        m.Outputform();*/
        m.Optionform(); 
    } 

    public void Optionform(){
        Main m = new Main();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Menu Pilihan");
        System.out.println("1. Input");
        System.out.println("2. Output");
        System.out.println("Pilih menu :");
        String Pilihan = myObj.nextLine();
        switch(Pilihan){
            case "1": int jmlData = 3;
            for(int i=0; i<jmlData; i++){
                System.out.println("Data ke "+i); 
                Person Inputdata=m.Inputform();
                m.ListPerson.add(Inputdata);
                System.out.println(" ================");
            }
            m.Optionform(); 
            break;
            case "2": this.Outputform();
            break;
            default: System.out.println("Tidak ada pilihan");
        }
    }

    public Person Inputform(){    
        Person p = new Person();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Form isian data");
        
        System.out.print("Masukan name :");
        String Name = myObj.nextLine();
        p.setName(Name);

        System.out.print("Masukan Gender :");
        String Gender = myObj.nextLine();
        p.setGender(Gender.charAt(0));

        
        System.out.print("Masukan Birthdate :");
        String Birthdate = myObj.nextLine();
        p.setBirthdate(Birthdate);

        System.out.print("Masukan Height :");
        String Height = myObj.nextLine();
        p.setHeight( Integer.parseInt(Height));

        System.out.print("Masukan Weight :");
        String Weight = myObj.nextLine();
        p.setWeight( Integer.parseInt(Weight));        

        return p;
    }
    
    
    public void Outputform(){
        int i = 0;
        for(Person p : ListPerson){
            System.out.println("================"); 
            System.out.println("Output Pengisian " + (i++)+":");
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
}
