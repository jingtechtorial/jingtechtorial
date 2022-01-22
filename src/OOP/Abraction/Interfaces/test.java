package OOP.Abraction.Interfaces;

public class test {
    public static void main(String[] args) {
        Shark shark=new Shark();
        shark.swim(4);
      //  CanFly canfly=new CanFLY(); YOU CAN  not create an instance
        Duck duck=new Duck();
        duck.fly();
        duck.swim(2);
        Eagle eagle=new Eagle();
        eagle.color="Black";
        eagle.fly();
        System.out.println(shark);
        System.out.println(duck
        );
        System.out.println(eagle);
        System.out.println(duck.numofWing);
        System.out.println(duck.FIN);
        //duck.FIN=0; YOU CANNT RE-INITIALIZE
        //vAriable which are coming from interface are  public and final by default
        duck.info();
        System.out.println(duck.name);
        duck.name="Puffy";
        System.out.println(duck.name);

        Puffin puffin=new Puffin();
        puffin.fly();
        puffin.run();
        puffin.info();
        puffin.swim(4);
    }

}
