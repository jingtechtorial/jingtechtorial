package object;

public class Staticpet {
    String name;
    int age;
    String color;
   static double food=20;

    public static void  eat(){//stastic has to before return type
        food-=1;
        System.out.println("food amount is now: "+food);

        //to call non static method into static method
        //you need to create object
        Staticpet pet9=new Staticpet();
        pet9.play();
    }

    public static void main(String[] args) {
        Staticpet pet1=new Staticpet();
        pet1.eat();
        pet1.eat();
        Staticpet pet2=new Staticpet();
        pet2.eat();
//==========================================================
        eat();
        Staticpet.eat();

    }
    public void play(){
        System.out.println("pet is playing");
        eat();
        Staticpet.eat();
        food=100;
        color ="blue";
    }
    //play();non static

}
