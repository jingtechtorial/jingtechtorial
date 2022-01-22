package immutable;

public class phone {
   private  double price=500;
    private String color="blue";
  private  String brand="own";




  public double getprice(){
      return price;
  }
public String getcolor(){
      return color;
}
public String getbrand(){
      return brand;
}

    public static void main(String[] args) {
        phone phone1=new phone();
        System.out.println(phone1.price);
        phone1.price=900;
        System.out.println(phone1.price);
    }
}
