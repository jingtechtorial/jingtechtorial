package Switchstatement;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
/*
        Ask user for his/her favorite fruit
        -you have: mango, banana, kiwi, orange, apple, grape
        if you have user's favorite fruit, --> We have your favorite fruit in our store
                -orher wise: Sorry, we don't have your favorite fruit :( :

 */
        Scanner input=new Scanner(System.in);
        System.out.println("what is your favorite fruit?");
        String fruit= input.nextLine().toLowerCase();
        switch(fruit){
            case "mango":
                System.out.println("we have your favourite fruit in our store.");
                break;
            case "banana":
                System.out.println("we have your favourite fruit in our store");
                break;
            default:
                System.out.println("sorry, we don't have your favorite fruit:(");

        }



    }
}
