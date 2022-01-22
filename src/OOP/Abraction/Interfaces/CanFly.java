package OOP.Abraction.Interfaces;

public interface CanFly {
    //all variable in interface are public and final
   int numofWing=2;
    int numTail=1;
// all methods in interface are public and abstract
    void fly();
    default void info(){
        System.out.println("info of canfly:"+ numTail+"-"+numofWing);
    }
}
