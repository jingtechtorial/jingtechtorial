package Switchstatement;

import java.util.Scanner;

public class oddeven {
    //Using scanner ask user to enter one string value. If this string length is odd number print middle 3 string from given value. If the string length is even number print string without first letter. (You need to use if statement for this task) Example 1: Please enter the String value: test The output is: est
    //
    //Example 2: Please enter the String value: Chicago The output is: ica
    public static void main(String[] args) {
        System.out.println("Please enter a string value");
        Scanner input=new Scanner(System.in);

        String word=input.nextLine();
        String word1=word.substring(1,word.length());
        String word2=word.substring(word.length()/2-1,word.length()/2+2);

        if(word.length()%2==0){
            System.out.println(word1);

        }else if((word.length()%2!=0)){
            System.out.println(word2);
        }

    }

}



