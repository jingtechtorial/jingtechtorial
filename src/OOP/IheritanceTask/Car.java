package OOP.IheritanceTask;

public class Car extends Vechicle {
    String model;
    String eninetype;
       public Car(){
           super("camry",2020,"Toyota");
       }
       public void drive(){
           System.out.println("car is moving");
       }
       //overriding accelerate();
  Car accelerate(){
      System.out.println(super.model);
      System.out.println("Car is accelerate");
      return new Car();
}

    public static void main(String[] args) {
        Car car=new Car();
      Car c1=  car.accelerate();
        System.out.println(c1);

    }
    }

