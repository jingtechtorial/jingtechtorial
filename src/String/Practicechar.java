package String;

import java.util.Scanner;

public class Practicechar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String device="microphone";
        device.charAt(0);
        char ch=device.charAt(0);
        System.out.println(ch);
        System.out.println(device.charAt(9));
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a word");
        String word=input.next();
        System.out.println(" this is your first letter of String" +word.charAt(0));
        System.out.println("please enter another word");
        //without storing incoming string value. taking a letter fom it and print
        System.out.println(input.next().charAt(0));

    }
}
