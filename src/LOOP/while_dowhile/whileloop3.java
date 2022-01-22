package LOOP.while_dowhile;

import java.util.Scanner;

public class whileloop3 {
    public static void main(String[] args) {
        // ask user to provide a whole integer number
        //create a multiplication table from 1 to 10 from the given number
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a whole number");
        int number= input.nextInt();
        int num=1;
        while(num<=10){
            System.out.println(number+"*"+num+"="+(number*num));
            num++;
        }

    }
}
