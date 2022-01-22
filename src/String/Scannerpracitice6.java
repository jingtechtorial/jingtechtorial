package String;

import java.util.Scanner;

public class Scannerpracitice6 {
    public static void main(String[] args) {
        //when we use nextLine() we can enter multiple words
        //when use next it will not take more than one word
       Scanner scanner=new Scanner (System.in);
       String str=scanner.nextLine();
        System.out.println("this value of first string " + str);
        String str1=scanner.next();
        //for this i cannot provide more than one word
        System.out.println("this value of string second " + str1);



    }
}
