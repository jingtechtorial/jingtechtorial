package IfSTATEMENT;

import java.util.Scanner;

public class Nestedifpractice {
   public static void main(String[] args) {
        //passport
        //visa
        // ticket
       Scanner input = new Scanner(System.in);
        System.out.println("Do you have passporst? yes/no ");
        String passport = input.nextLine();

       if (input.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("enjoying your flight ");
        }
        if (input.nextLine().equalsIgnoreCase("yes")) {
        } else {
            System.out.println("please get a ticket ");
            if (passport.equalsIgnoreCase("yes")) {
                System.out.println(" Do you have visa? yes/no ");
            } else {
                System.out.println("you need to get visa");
            }


                System.out.println("please get passport first?");
            }

        }
    }
