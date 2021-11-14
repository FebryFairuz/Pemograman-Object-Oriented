import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Cara Store nilai sett dan get dengan Atribut

public class Main2 {
    
    Person p = new Person(); 
    public List <Person> ListPerson = new ArrayList<Person>();

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Main2 m = new Main2();
        for (int i = 0; i < 3; i++) {
            System.out.println("===============");
            System.out.println("Data ke-"+i);    
            System.out.println("===============");
            m.Inputform();
            m.ListPerson.add(m.p);
        }
        
        m.Outputform();    
    }

    public void Inputform(){
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
    }
    
    public void Outputform(){
        int i = 0;
        for(Person p : ListPerson){
            System.out.println("=================="); 
            System.out.println("Output Pengisian " + (i++)+":");
            System.out.println("=================="); 
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
