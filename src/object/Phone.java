package object;

public class Phone {
    String brand;
    double price=1000;
    String color;

    public Phone(String newcolor,String newbrand){
        this.color=newcolor;
        this.brand=newbrand;
        System.out.println("this is two argument constructor ");
    }


    public Phone(){
        System.out.println("this is no argument contructor");
    }
    public Phone(String newcolor){
        this.color=newcolor;
        System.out.println(" this is argument constructor");

    }
    public Phone(String newcolor,int price){
        this.color=newcolor;

        System.out.println("this is two argument constructor ");
    }






    public void setColor(String color1){
        color= color1;
    }//method to call
    public void call(int number){

        System.out.println(number+"is being called");
    }
}
