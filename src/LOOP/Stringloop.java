package LOOP;

import java.util.Scanner;

public class Stringloop {
    public static void main(String[] args) {
        //get a string from user and print out every letter from give string seperate by comma
        //input winter
        //out---, w, i , n , t, e, r,
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a string");
        String word= input.nextLine();
        int i=0;
        while(i<word.length()){
            System.out.println(word.charAt(i)+",");
            i++;
        }
        //print those letters in reverse order

        int lastindex=word.length()-1;
        while(lastindex>=0) {
            System.out.print(word.charAt(lastindex) + ",");
            lastindex--;
        }
    }
}

