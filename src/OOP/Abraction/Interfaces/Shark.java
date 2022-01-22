package OOP.Abraction.Interfaces;

public class Shark implements CanSwim {
    public int swim(int mile){
        System.out.println("shark is swimming very fast");
        return mile*3;

    }
}
