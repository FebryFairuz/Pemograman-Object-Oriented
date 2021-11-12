package karyawan.Quiz;

import java.util.Scanner;

class Human{
    public Integer Weight;
    private Integer Height;

    public Integer getWeight() {
        return Weight;
    }
    public void setWeight(Integer weight) {
        Weight = weight;
    }
    public Integer getHeight() {
        return Height;
    }
    public void setHeight(Integer height) {
        Height = height;
    }    
}

class Person extends Human{
    private String Name;
    private String BirthDate;
    public String Gender;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }    
}

public class Soal6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("=============================");
        System.out.println("Form Personal Information");
        System.out.println("=============================");

        System.out.print("Entering your name:");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Entering your birth date:");
        String birthdate = scanner.nextLine();
        person.setBirthDate(birthdate);
        
        System.out.print("Entering your Gender:");
        String gender = scanner.nextLine();
        person.setGender(gender);
        
        System.out.print("Entering your Weight:");
        String weight = scanner.nextLine();
        Integer weight_convert = Integer.parseInt(weight);
        person.setWeight(weight_convert);

        System.out.print("Entering your Height:");
        String height = scanner.nextLine();
        Integer height_convert = Integer.parseInt(height);
        person.setHeight(height_convert);


        System.out.println("\n\n=============================");
        System.out.println("Your Personal Information");
        System.out.println("=============================");

        System.out.println("Name: "+ person.getName());
        System.out.println("Birth Date: "+ person.getBirthDate());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Weight: "+ person.getWeight());
        System.out.println("Height: "+ person.getHeight());

        scanner.close();
    }
}