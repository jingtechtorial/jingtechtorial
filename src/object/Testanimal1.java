package object;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Testanimal1 {
    public static void main(String[] args) {
        Animal duck=new Animal();
        duck.info();
        System.out.println(duck.name);
        System.out.println(duck.age);
        Animal bird=new Animal();
        bird.name="woody";
        bird.age=30;
        bird.breed="husky";
        bird.energy=70;
        bird.run();
        bird.info();
    }
}
