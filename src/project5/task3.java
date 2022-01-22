package project5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a number?");
        int number= input.nextInt();
        int a=0; int b=2; int c=0;
        for ( ;a<=number    ;a++   ){
            for (;b<number;b++){
                if (number%b==0)
                    c++;
                //System.out.println(b);}

            }

        } if (c!=0){
            System.out.println("this is not a prime number ");}
        else {
            System.out.println("this is a prime number ");
        }
    }}















