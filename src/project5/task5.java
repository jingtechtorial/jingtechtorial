package project5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 10");

        int number = input.nextInt();
        //int layersOfPyramid = number;

        for (int a =number; a>=1; a--){
            for(int b =1; b <= a ; b++){
                System.out.print(a );//print out 5555544443332211
            }                              //         4444
           System.out.println();         //        333
                                            //         22
        }                                    //           1
    }
}


