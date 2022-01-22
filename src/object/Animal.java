package object;

public class Animal {
    String name;//declare the data type
    int age;
    String color;//these are object/instance/example variable
    double weight;
    double height;
    String gender;
    String breed="boxer";
    int energy=100;

public void sleep(){
    energy=100;
    System.out.println(name+ " is sleeping");
    System.out.println(name+" is charging up");

    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void run(){
    energy=energy-10;
        System.out.println(name + "has"+energy +"percent energy");
    }

    public void info(){
        System.out.println("name is:" +name+ "age is:"+age+" color is:"+color+ "breed is:"+breed+ "energy is:"+energy);
    }
   }



