package IfSTATEMENT;



import java.util.Scanner;

public class Nextifpractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which city are your in? ");
        String city = input.nextLine();
        if (city.equalsIgnoreCase("chicago")) {
            System.out.println("which course are you in");
            String courses = input.nextLine();
            if (courses.equalsIgnoreCase("techtorial")){
                System.out.println("which batch are you in ");
            String batch = input.nextLine();
            if (batch.equalsIgnoreCase("11")) {
                System.out.println(" it is get easy?");
            } else {
                System.out.println("congrats you are already done");
            }

        } else {
            System.out.println("we are at des plaines, please visit");
        }
    }
       else

    {System.out.println("please come to chicago, you will like it in the summer");}

    }
}



