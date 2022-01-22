package String;

import java.util.Scanner;

public class Scannerpracitce4 {
    public static void main(String[] args) {


        //ask user to enter interger number
        //we will find out if this is an even number or not
        //input is 7
        //output is even number false
        //input is 8 output is even number true
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //if remainder with 2 gives 0 this even number, other will odd number
        boolean iseven = number%2 ==0;
        System.out.println( number +" is even number" + iseven);
        //ask user to enter two integer number
        //first integer you provide should be b
        // bigger than second one
        //if the first number bigger than the second one, will be true
        //if the second number bigger than first number, will be false
        System.out.println("enter your first integer number");
        int firstnumber= scanner.nextInt();
        System.out.println("plese enter an integer but small than first one");
        int secondnumber= scanner.nextInt();
        boolean isfirstnumber=firstnumber>secondnumber;
        System.out.println(isfirstnumber);


        //to be able to graduat from school
        //student needs %85 attendance
        //80 or higher grade
        //%70 of homework
        //create a program for teacher
        //teacher will enter all these variable
        //if student pass, will be true
        //if student fail, will be false
        System.out.println("please enter student attendance");
        int attendance= scanner.nextInt();
        System.out.println("please enter the grade of student");
        int grade=scanner.nextInt();
        System.out.println("please enter the homework of student");
        int homework=scanner.nextInt();
        boolean ispass=attendance>=85 &&grade>=80 && homework>=70;
        System.out.println(ispass);


    }




}
