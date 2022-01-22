package object;

import java.util.Scanner;

public class Testanimal {
    public static void main(String[] args) {
        //create the main method to be able to run the code
        String str=new String("test");
        Scanner scanner=new Scanner(System.in);

        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.name="leo";
        cat.age=9;
        cat.color="orange";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);
        //create a dog animal,try to use instance variable with your new object
        Animal dog=new Animal();

        dog.weight=20.50;
        dog.height=43.10;
        dog.gender="male";
        System.out.println(dog.weight);
        System.out.println(dog.height);
        System.out.println(dog.gender);

        System.out.println(cat.breed);
        System.out.println(dog.breed);
        cat.breed="scottish";
        System.out.println(cat.breed);

        cat.sleep();
        dog.sleep();
        cat.eat();
        dog.eat();
        cat.run();
        System.out.println(cat.energy);
        System.out.println(dog.energy);
        cat.run();
        cat.run();//70
        //charge the animal when they sleep
        cat.sleep();
        System.out.println(cat.energy);
        dog.sleep();
        System.out.println(cat.energy);


    }

}
