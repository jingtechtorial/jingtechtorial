package object;

public class teststatic {
    public static void main(String[] args) {
       Staticpet.eat(); //you can call static method from another class by using name of class, no need
        //to create an object
        Staticpet pet=new Staticpet();
        pet.eat();
        pet.play();
        System.out.println(pet.food);
    }
}
