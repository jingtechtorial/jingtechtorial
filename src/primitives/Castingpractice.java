package primitives;

public class Castingpractice {
    public static void main(String[] args) {
        int number1=23;
        long l1=number1;//implicit casting happens by java
        short sh1=(short)number1;//explicit casting--larger data type to small data type
        byte by1=1;
        byte by2=2;
        //short sum1=by1+by2;compile time error;(wrong)due to numeric promotion java wants to store the
       // result in to larger data type(int).that is why it is compile  time error
        short sum2=(short)(by1+by2);//explicit casting
        //short  sum3=(short)by1+(short)by2;//result is not casted out,individual casting for each variable
        int price=(int)750.99;
        double samsung=900.45;
        int pricesamsung=(int)samsung;
        System.out.println("samsung" +samsung);
        System.out.println("price samsung in int"+pricesamsung);



    }
}
