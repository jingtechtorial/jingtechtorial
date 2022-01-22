package String;

import java.util.Scanner;

public class Scannerpractice {
    public static void main(String[] args) {
        String name="David";
        System.out.println("my name is"+name);
        //creating scanner object
        Scanner input= new Scanner(System.in);
        String lastname=input.nextLine();
        System.out.println(lastname);
        //task:ask user to enter his/her city name and print as <name><lastname>you are living in <city>

        System.out.println("please enter your city name");
        String city=input.nextLine();
        System.out.println(name+ "lastname"+" you are living in "+city);
        lastname="xxxxx";
        System.out.println(lastname);
        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println(name+" your age is very good age.That is >> "+age );

        System.out.println("please enter your height in feet and inches ");
      double height = input.nextDouble();
        System.out.println("your height is" + height);

        System.out.println("please enter your address");
        input= new Scanner(System.in);//input=input.next();input=new Scanner(System.in);
        String address=input.nextLine();
        System.out.println("Is this correct address you provided? "+address);
    }
}
