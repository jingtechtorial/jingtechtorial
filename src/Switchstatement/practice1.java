package Switchstatement;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        /*
        get number between 1 to 4 from user
        print out name of season as:
        1--->winter
        2--->spring
        3--->summer
        4--->fall
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=input.nextInt();
        switch(num){
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("fall");
                break;
            default:
                System.out.println("there is no such season,please enter a valid number for your select ");
        }
    }
}
