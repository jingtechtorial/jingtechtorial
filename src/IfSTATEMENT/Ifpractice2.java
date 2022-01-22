package IfSTATEMENT;

import java.util.Scanner;

public class Ifpractice2 {
    public static void main(String[] args) {
        //assume that user is military style time 1-24
        //print out good morning /good afternoon
        //for the hours of morning or afternoon
        //ask user to enter only hour for the time
        //if the hour is less than 12print good morning
        //if the hour is more than 12 less than 18 print good after
        //if the hour is more than 18 print good evening
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter hour as 1-24 ");
        int hour = scanner.nextInt();
        if (hour < 12) {
            System.out.println(" good morning ");
        }
        if(hour>=12 && hour <18){
            System.out.println(" good afternoon");}
        if(hour>=18 && hour <24 ){
            System.out.println(" good evening ");}
        if(hour<0 || hour>23){
            System.out.println(" good evening ");}
        if(hour<0 || hour>23){
            System.out.println("check your time");}


    }
}