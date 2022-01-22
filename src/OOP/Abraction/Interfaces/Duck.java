package OOP.Abraction.Interfaces;

import OOP.Abraction.AbstractClasses.Canrun;
import OOP.Iheritance.Animal;

public class Duck extends Animal implements CanFly, CanSwim {
    public void run(){
    }
    public void fly(){
        System.out.println("duck is flying");
    }
    public int swim(int km){
        System.out.println("duck is swimming");
        return km;
    }
    public void info(){
        System.out.println("duck is ....");
    }
}
