package project5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter one string value");
        String str=input.nextLine().trim(); String update="";
        for (int a=0 ;a<str.length();a++){ // we will check every letter from string from user
            if (update.indexOf(str.charAt(a))==-1 || str.charAt(a)==' '){   // if it does not find maching char/char sequence
                // it will return -1 ( false )  // added charAt (space ) because we have to keep spaces in new string
                update=update+str.charAt(a);// so if its doesnt find same char we will add char to
                //string update
            }

        }
        System.out.println(update); // we print after the block
    }
}
