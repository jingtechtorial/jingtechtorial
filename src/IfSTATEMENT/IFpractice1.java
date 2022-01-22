package IfSTATEMENT;

import java.util.Scanner;

public class IFpractice1 {
    public static void main(String[] args) {
        //get a number  between 1 to 7 from user
        //print the name of the day for that given number from user
        //1---monday
        //2---tuesday
        //7--sunday
        Scanner scanner=new Scanner(System.in);
        System.out.println(" please enter a number between 1 to 7");
        double numb= scanner.nextDouble();
        int number=(int)numb;
        if (number==1)
        {
            System.out.println(" monday");}
        if(number==2){
            System.out.println("tuesday");}
        if(number==3){
            System.out.println("wednesday");}
        if(number==4){
            System.out.println("thursday");}
        if(number==5){
            System.out.println("friday");}
        if(number==6){
            System.out.println("saturday");}
        if(number==7){
            System.out.println("sunday");}
        //if the user enters out of range number
        //print your number is out of range
        if(number<7 || number>1){
            System.out.println("print your number is out of range ");}


    }
}
