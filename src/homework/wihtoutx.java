package homework;

import java.util.Scanner;

public class wihtoutx {
    /*
    Given a string, if one or both of the first 2 chars is 'x',
    print the string without those 'x' chars, and otherwise print the string unchanged.
     Examples:

"xHi" → "Hi" "Hxi" → "Hi" "Tesxt" → "Testxt"
     */


    public static void main(String[] args) {
        System.out.println("Enter a string value");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string value");
        String word=input.next();
        char ch1=word.charAt(0);
        char ch2=word.charAt(1);
        char character='x';
        String update=word.charAt(0)+word.substring(2);
        //System.out.println(update);
        if (ch1=='x' && ch2=='x'){System.out.println(word.substring(2, word.length()));}
        else if(ch1=='x'){System.out.println(word.substring(1,(word.length())));}
        else if(ch2=='x'){System.out.println(update);}
        else {System.out.println(word);}
    }



}


