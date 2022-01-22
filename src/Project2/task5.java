package Project2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter 5 digit number");//67835
        int number= input.nextInt();
        int remainder1=number%10;//5
        int num1=number/10;//6783
        int remainder2=num1%10;//3
        int num2=num1/10;//678
        int remainder3=num2%10;//8
        int num3=num2/10;//67
        int remainder4=num3%10;//7
        int num4=num3/10;//6.0
        int remainder5=num4;//6
        System.out.println(remainder1+""+remainder2+""+remainder3+""+remainder4+""+remainder5);



    }
}
