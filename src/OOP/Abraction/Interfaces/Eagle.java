package OOP.Abraction.Interfaces;

public class Eagle implements CanFly{
    String color;
    @Override
    public void fly() {
        System.out.println("Egle is flying");
    }

    @Override
    public void info() {
            System.out.println("Egle is :"+color);
        }
    }

