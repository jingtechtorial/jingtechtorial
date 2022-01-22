package OOP.Abraction.AbstractClasses;

public class Onlinestudent extends Student {

    public void attend(){
        System.out.println("online student is attending via zoom");
    }
    public void watch(){
        System.out.println("online student is watching java");
    }
    public Onlinestudent(){
        super("Mary",27);
    }
    public void sleep(int hour){
        System.out.println("online student is sleeping");
    }
}
