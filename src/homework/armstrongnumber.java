package homework;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        //rite a Java program to check whether a given number is an armstrong number or not.  NOTE: An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits. For example, 370 is an Armstrong number since 370 = 333 + 777 + 000 Look at example below carefully.
        //
        //Test Data : Input a number: 153 Expected Output :153 is an Armstrong number
        //
        //Input a number: 230 Expected Output : 230 is not an Armstrong number
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=input.nextInt();
        int number = 0;
        int temp = 0;
        int total = 0;
        number = a;
        while (number != 0)
        {
            temp = number % 10;
            number /= 10;
            total = total + temp*temp*temp;
            //number /= 10;
        }
        if(total == a)
            System.out.println(a + " is an Armstrong number");
        else
            System.out.println(a + " is not an Armstrong number");
    }
}





