package primitives;

public class Remainderpractice2 {
    public static void main(String[] args) {
        //find the product digits from given number
        //456===4*5*6=120 sout("the product is =" +<product>
        int num =456;
        int d1=num%10;

        num=num/10;
        int d2=num%10;
        num=num/10;
        int d3=num%10;

        int product=d1*d2*d3;
        System.out.println("the product is="+d1*d2*d3);







    }
}
