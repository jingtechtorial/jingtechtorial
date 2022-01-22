package OOP.IheritanceTask;

public class Vechicle {
   /* ===================TASK===================
            -Vehicle
    Variables:
    protected  model;
    default year;
    public brand;
    Methods:
    drive(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return Object
    Constructor: create a constructor to initiliaze instance variables
-Car
  *extends Vehicle
    variables:
    model;
    engineType;
    Methods:
    Override drive(); --> Car is moving
    Override accelerate(); --> return Integer and calls model from parent class
    */

    protected String model;
    int year;
    public String brand;
    public Vechicle(String model,int year,String brand){
        this.model=model;
        this.year=year;
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void drive(){
        System.out.println("vechicle is moving");
    }
    public boolean stop(boolean isstopped){
        System.out.println("vechicle is stopping");
        return isstopped;
    }
    protected boolean  start(boolean isstarted){
        System.out.println("vechicle is starting");
        return isstarted;
    }
    Vechicle  accelerate(){
        System.out.println("vechicle is accelerate>>>>");
        return new Vechicle(model,year,brand);
    }
















}
