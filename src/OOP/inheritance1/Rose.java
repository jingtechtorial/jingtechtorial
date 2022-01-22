package OOP.inheritance1;



public class Rose extends Flower{
    String smell;
    double price;
    public Rose(String smell){
        super("Red",4.99,9);
        this.smell=smell;
    }
public double getprice(){
        return price;
}
    public static void main(String[] args) {
        Flower flower=new Flower("Yellow",2.99,5);
        System.out.println(flower.color);
 Rose rose=new Rose("sweet");
        System.out.println(rose.color);
        System.out.println(flower.price);
        System.out.println(flower.getprice());
        System.out.println(rose.getprice());
        System.out.println(rose.price);
        Flower flower1=new Flower();
        System.out.println(flower1.getprice());
        System.out.println(flower1.size);
        flower1.price=8.99;
        System.out.println(flower1.getprice());
        System.out.println(flower1.price);
        System.out.println(flower1);
    }

}
