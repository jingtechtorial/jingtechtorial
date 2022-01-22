package IfSTATEMENT;

import java.util.Scanner;

public class Elsetask2 {
    public static void main(String[] args) {
        //find out if your zipcode is even number or odd number
        System.out.println("please enter your zipcode ");
        Scanner sc=new Scanner(System.in);
        int zipcode1=sc.nextInt();
        if(zipcode1%2==0){
            System.out.println("your zipcode is even number ");}
        else{
            System.out.println("your zipcode is odd number ");}
    }
}
