package primitives;

public class Unarypractice2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int result = --a + --b + a++ * 2 - b++ * a--;//6+3+6*2-3*7=0
        System.out.println(result);
        System.out.println(a);


        System.out.println(b);


        int donutnumber = 12;
        int eachdonut = 2;
        int total = donutnumber * eachdonut;
        System.out.println(total);
        System.out.println(--total);

        char ch='a';
        System.out.println('a');

        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(++ch);

    }









}
