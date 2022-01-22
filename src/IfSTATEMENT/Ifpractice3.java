package IfSTATEMENT;

import java.util.Scanner;

public class Ifpractice3 {
    public static void main(String[] args) {
        //ask user to enter a single word
        //if word's first letter is:
        //M-->there is a day starts with M, print out monday
        //T -->there is a day starts with T.print out tuesday
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a single word");
         String word=scanner.nextLine();
        if(word.startsWith("M")){
            System.out.println("MONDAY");}
        if(word.charAt(0)=='S') {
            System.out.println("saturday/sunday");
        }
      if(!word.startsWith("M")||!word.startsWith("T")||word.startsWith("W")&&!word.startsWith("F")&&!word.startsWith("S")) {
          System.out.println("there is no day !!!");
      }
    }
}
