package IfSTATEMENT;

import java.util.Scanner;

public class Elsetask1 {
    public static void main(String[] args) {
        /*
        task
        when your order total is more than $1000 you get %20 discount,other wise you get %5 discount
        calculate and print total discount and payment in each case
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the total amount you spent ");
     double total=1000;

        if(total>=1000){
            System.out.println("your discount is "+total*0.20);

        System.out.println("yourpayment after discount is" +(total-(total*0.2)));}
        else{
            System.out.println("your total discount is "+ total*0.05);
            System.out.println("your payment after discount "+(total-(total*0.05) ));}


    }
}
