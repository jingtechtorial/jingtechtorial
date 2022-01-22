package homework;

import java.util.Scanner;

public class substring {
    //Using the scanner ask the user to enter one String value.
    // If the string length is bigger than or equals to 3 print the string without first and last char.
    // If the length is not bigger than 3 print as it is.
    // (for this task you need to use if statement). Example 1: Please enter the String value: test The output is: es Example
    // 2: Please enter the String value: Hello The output is: ell
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        int a=word.length();
        if(a>=3){
            System.out.println(word.substring(1,word.length()-1));
        }else if(a<3){
            System.out.println(word);}
    }
}







