package LOOP.while_dowhile;

import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {
        // ask user to enter an integer value and find the divisors of the give number
        Scanner input=new Scanner(System.in);
        System.out.println("enter whole number");
        int number= input.nextInt();
        int divisor=1;
        while(divisor<=number){
            if(number%divisor==0){
                System.out.println(divisor+" is divisor of" +number);
            }
            divisor++;
        }
    }
}
