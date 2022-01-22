package homework;

import java.util.Scanner;

public class uppercaselowercase {
    /*If the string doesn't have any upper case letter or any lower case letter print "Your password is not acceptable"

            2 - > If the first character of the password is upper case letter and last character of the password is not letter print "Your password is strong".

            3 - > If first character of the password is lower case letter and last character of the string is upper case print "Your password should be improved"

            4 - > For all other conditions print "Your password is not valid"

    For this task you should use if else statement.

    This is the hardest task in this week's homework and I will send solution for this task on Monday.
    */
    public static void main(String[] args) {
        System.out.println("Enter a password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        // Word -> WORD
        // upperCase and lowerCase method
        // Only effect letters in the string
        // upperCase make all letters upperCase
        // lowerCase make all letters lowerCase

        // All letters are upper case
        // length of uppercase and lowerCase and password are the same.
        String upperCase = password.toUpperCase();
        // All letters are lower case
        String lowerCase = password.toLowerCase();

        int lastIndexOfPassword = password.length()-1;

        if(upperCase.equals(password)||lowerCase.equals(password)){
            System.out.println("Your password is not acceptable");
        }else if(upperCase.charAt(0)==password.charAt(0)&&lowerCase.charAt(0)!=password.charAt(0)
                &&
                upperCase.charAt(lastIndexOfPassword)==lowerCase.charAt(lastIndexOfPassword)){
            System.out.println("Your password is strong");
        }else if(lowerCase.charAt(0)==password.charAt(0)&&upperCase.charAt(0)!=password.charAt(0)&&
                password.charAt(lastIndexOfPassword)==upperCase.charAt(lastIndexOfPassword)  ){
            System.out.println("Your password should be improved");
        }else{
            System.out.println("Your password is not valid");
        }





    }
}
