package Project2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number of quarter");
        int quarter=input.nextInt();
        System.out.println("please enter number of dimes");
        int dimes=input.nextInt();
        System.out.println("please enter number of nickle");
        int nickle=input.nextInt();
        System.out.println("please enter number of pennies");
        int pennies=input.nextInt();
        double total=(quarter*0.25+dimes*0.1+nickle*0.05+pennies*0.01);
        //System.out.println(total);


        System.out.println("the total in dollar is "+ total);

    }
}
