package IfSTATEMENT;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        /*nested if----java>selenium>API>Sql
        ask user:
        -s/he knows java yes/no
        yes: ask s/he knows Selenium
                       can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congratulation!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge

         */
        Scanner input = new Scanner(System.in);
        System.out.println("do you know java? yes/no");
        String java = input.nextLine();
        if (java.equalsIgnoreCase("yes")) {
            System.out.println("do you have Selenium experience? yes/no/learn ");
            String selenium = input.nextLine();
            if (selenium.equalsIgnoreCase("yes") || selenium.equalsIgnoreCase("learn")) {
                System.out.println("do u  have API testing experience ");
                String api = input.nextLine();
                if (api.equalsIgnoreCase("yes")) {
                    System.out.println(" do you have sql knowledge? yes/no ");
                    String sql = input.nextLine();
                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("you are hired");


                    } else {
                        System.out.println("we need someone with API knowledge");
                    }
                } else {
                    System.out.println("we need someone with selenium knowledge");
                }
            } else {

            }
        } else {

        }

    }

}

