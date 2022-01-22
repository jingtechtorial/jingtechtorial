package String;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Scannerpractice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //get name and DOB year of user
        //calculate user's age
        //print "<name>you are<age> year old"
        //age =current year-DOB(year)
        System.out.println("please enter your name");
        String name= scanner.nextLine();
        System.out.println("please enter your birth year");
        int birthyear= scanner.nextInt();
        int age=2021-birthyear;
        System.out.println(name+" you are"+age+ "years old");





    }




}
