package homework;

import java.util.Scanner;

public class replacea {
    //Using the scanner ask the user to provide String value.
    // Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
    // Look at example below carefully
    // For example: Input: Success Output: "auccess" "aaccess" “aaacess” "aaaaess" "aaaaass" "aaaaaas" "aaaaaaa" “aaaaaaa”
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a string value");
        String value=input.nextLine();
        int index=1;
        String a="a";
        while(index<=value.length()){
            value=value.substring(index);
            value=a+value;
            index++;
            a +="a";
            System.out.println(value);
        }
    }
}

