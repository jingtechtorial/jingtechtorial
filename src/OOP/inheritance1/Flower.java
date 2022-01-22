package OOP.inheritance1;

public class Flower {
    String color;
    double price;
    int size;
public Flower(String color,double price,int size){
    this.color=color;
    this.price=price;
    this.size=size;

}
public Flower(){

}



public double getprice(){
    return price;
}

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
