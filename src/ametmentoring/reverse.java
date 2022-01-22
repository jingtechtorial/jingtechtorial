package ametmentoring;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        // ask the user to input a word and reverse it
        // ask the user to input a number and reverse it
        Scanner input=new Scanner(System.in);
        System.out.println("please enter any number");
        String word=input.nextLine();
        //you have to knoe th meaning of reverse(opposite)ahmet
        //how am i going to reverse a string
        //how can i reach out each of the character from string
        //where am i going to store them reverse
        String name="";
        for(int i=word.length()-1;i>=0;i--){
            name+=word.charAt(i);
        }

        System.out.println(name);


    }
}
