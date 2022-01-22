package LOOP;

import java.util.Scanner;

public class makingstartree {
    public static void main(String[] args) {

         /*ask user to provide a number 3 to 10
         -make a star for that many line
         (use do while lopp to implement solution)
         ex:input---4
           */
        Scanner input=new Scanner(System.in);
        System.out.println("please provide a number 3 to 10");
        int number= input.nextInt();
        int num1=0;
        String str="*";
        do{
            System.out.println(str);
            num1++;
            str+="*";
        }while(num1<number);


    }
}
