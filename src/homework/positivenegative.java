package homework;

import java.util.Scanner;

public class positivenegative {
    //Write a Java program to get an integer number from the user and print whether it is positive or negative.
    //
    //Example Input number: 35 Output: positive Input number: -35 Output: negative
    public static void main(String[] args) {
        System.out.println("Please enter an integer number");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number>=0){
            System.out.println("positive");

        }else{
            System.out.println("negative");
        }


    }



}


