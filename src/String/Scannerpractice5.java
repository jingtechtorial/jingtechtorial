package String;

import java.util.Scanner;

public class Scannerpractice5 {
    public static void main(String[] args) {
        //we will ask user to their first name
        //we will ask user to their last name
        // will print firstname in lowercase
        //last name in upper value
        //.toLowerCase();==makes the all letter lower cases
        //.toUpperCase();==makes the all letter upper cases
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname= scanner.nextLine();
        System.out.println("enter your last name ");
        String lastname=scanner.nextLine();
        System.out.println(firstname.toLowerCase()+lastname.toUpperCase());




    }
}
