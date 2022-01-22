package OOP.Abraction.Interfaces;

import OOP.Abraction.AbstractClasses.Canrun;

public class Puffin extends Canrun implements CanFly,CanSwim{
    @Override
    public void info() {
        CanFly.super.info();
    }

    @Override
    public void fly() {

    }

    @Override
    public int swim(int mile) {
        return 0;
    }

    @Override
    public void run() {

    }
}
