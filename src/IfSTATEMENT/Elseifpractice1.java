package IfSTATEMENT;

import java.util.Scanner;

public class Elseifpractice1 {
    /*get three tests result from user and caculate the average of those three tests
    based on the average score;
    print out letter grade for this student
    average -->100-90----your letter grade is A
    average is 89-80-----your letter grade is B
    average is 79-60----your letter grade is C
    average is less than 60---you should take the course again

     */
    public static void main(String[] args) {

    
    Scanner input=new Scanner(System.in);
    System.out.println(" enter score1");
    int score1=input.nextInt();
    System.out.println(" enter score2");
    int score2=input.nextInt();
    System.out.println(" entet score3 ");
    int score3=input.nextInt();
    int average=(score1+score2+score3)/3;
    if(average>=90 && average<=100){
        System.out.println("your letter grade is A");
    }else if(average>=80 && average<89){
        System.out.println(" your letter grade is B");}

    }


}
