package primitives;

public class Numericpromotion {
    public static void main(String[] args) {
        byte b1=12;
        short sh1=b1;
        short sh2=3;
        //byte b2=sh2; compile time error,you can not store larger data type into small data type
       byte b2=2;
       int result=b1+sh2;
       int i1=4;
       double d1;
       //int i1=d1;compile error (small the data type to larger)
        float f1=1.2f;
       float f2=3.4f;
       float result3=f1+f2;
       double d4=1.2;
       //float result4=f1+d4 compile error
        double result4=f1+d4;

        char c=23;

    }

}
