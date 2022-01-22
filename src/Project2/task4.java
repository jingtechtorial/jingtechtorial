package Project2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a 6 digit number ");
        int num=input.nextInt();
        System.out.println(num);//578432
       int remainder1=num%10;//2
        int num1=num/10;//57843
        int remainder2=num1%10;//3
        int num2=num1/10;//5784
        int remainder3=num2%10;//4
        int num3=num2/10;//578
        int remainder4=num3%10;//8
        int num4=num3/10;//57
        int remainder5=num4%10;//7
        int num5=num4/10;//5
        int remainder6=num5;//5
        System.out.println(remainder6);
        int sum1=remainder1*remainder2*remainder3*remainder4*remainder5*remainder6;
        int sum=remainder1+remainder2+remainder3+remainder4+remainder5+remainder6;
        System.out.println("Multiplication of all digits is " + sum1 +"the sum of all digits" + sum);
        System.out.println(remainder1);
        System.out.println(remainder2);
        System.out.println(remainder3);
        System.out.println(remainder4);
        System.out.println(remainder5);
        System.out.println(remainder6);

    }
}
