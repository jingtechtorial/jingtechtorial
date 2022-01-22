package homework;

import java.util.Scanner;

public class bluered {
    /*Using the scanner ask the user to enter any String value.
    If this String has a color like red or blue with lower case print the red or blue.
     Other wise do not print anything. EXAMPLE-1: Input: "xxredyy" Output: red EXAMPLE-2: Input: "xbxltue" Output: blue
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string value");
        String word=input.nextLine();
        if(word.toLowerCase().contains("r") && word.toLowerCase().contains("e") && word.toLowerCase().contains("d") || (word.toLowerCase().contains("red"))){
            System.out.println("red");
        }


        if(word.toLowerCase().contains("b")&&word.toLowerCase().contains("l")&&word.toLowerCase().contains("u")&&word.toLowerCase().contains("e")||word.contains("blue")){


            System.out.println("blue");
        }





    }
}

