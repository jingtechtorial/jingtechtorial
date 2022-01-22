package Arraylist;

public class Computer {


    String brand;
    Double price;
    double screensize;
    String color;
    int storage;


    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", screensize=" + screensize +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                '}';
    }

    public Computer(String brand, double price, double screensize, String color, int storage){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.screensize=screensize;
        this.storage=storage;


    }
}
