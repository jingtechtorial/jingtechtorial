package homework;

import java.util.Scanner;

public class concat {
    //Using the scanner ask the user to enter a String value and if both string length is same concatenatethem together then print the result.
    // If both String length is not same then omit last chars from the longer string so it is the same length as the shorter string.
    // After making both strings the same length then concatenate them and print the result.
    // NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
    // EXAMPLE-1: String 1: "Cell" String 2: "Phone" Output: "CellPhon" EXAMPLE-2: String 1: "Cable" String 2: "Mic" Output: "CabMic"

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter string 1");
        String word=input.nextLine();
        System.out.println("Enter string 2");
        String word1=input.nextLine();
//two string value
//if both string length is the same, concat two string together and
//print out
//if the length is not the same,omit last chars from longer string
//so it is the same length as shorter string.ater concat.the print out
        if(word.length()==word1.length()){
            System.out.println(word.concat(word1));

        }else if(word.length()>word1.length()){
            System.out.println(word.substring(0,word1.length())+word1);
        }
        else if(word1.length()>word.length()){
            System.out.println(word+word1.substring(0,word.length()));

        }
    }
}

