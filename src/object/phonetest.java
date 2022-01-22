package object;

public class phonetest {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.brand="iphone";
        phone.call(1111);

        Phone phone1=new Phone();
        Phone phone2=new Phone("pink");
        System.out.println(phone2.color);

        Phone phone3=new Phone("black","samsung");

    }
}
