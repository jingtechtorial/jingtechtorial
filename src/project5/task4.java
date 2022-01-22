package project5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //Ask the user to enter one number between 1 to 10 then, Write the
        //program to print the string in the following format:
        //Example:
        //Input: 5
        //Output:
        //1
        //22
        //333
        //4444
        //55555

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number between 1 to 10 ");
        int number = input.nextInt();
        int linesofPyramid = 1;
        for (int a = 1; a <= number; a++) {  //will run for how many lines we have
            for (int j = 1; j <= a; j++) {  // for loop inside of loop
                if (j == a) {
                    System.out.print(linesofPyramid++);//123
                } else {
                    System.out.print(linesofPyramid + "");//12233344445555
                }
                //    }System.out.println();


            }


        }
    }
}