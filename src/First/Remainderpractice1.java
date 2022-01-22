package First;

public class Remainderpractice1 {
    public static void main(String[] args) {
        //modulus ---remainder(left over after division)
        int number1=45;
        int number2=6;
        int remainder1=number1%number2;


    //find the sum of digits from given number
        //123---1+2+3=6==sout(sum is >> <sum>)

        //123%10---3
        //12%10---2
        //1%10---1

        int mynumber=123;

        int digit3=mynumber%10;
        mynumber=mynumber/10;
        int digit2=mynumber%10;
        mynumber=mynumber/10;
        int digit1=mynumber%10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        double sum=digit1+digit2+digit3;
        System.out.println("the sum is="+sum);





    }
}
