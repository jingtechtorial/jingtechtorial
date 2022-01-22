package Switchstatement;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        base on the name of th shape
        calculate the area of that shape
        get length and width and height of those shape from user to use them in calculation s
        print out name of the shape and area of that shape
        -triangle l*w
        -rectangle (base*height)/2

       */

        Scanner input=new Scanner(System.in);
        System.out.println("what shape do you want to calculate area of ? triangle/rectangle");
        String shape=input.nextLine().toLowerCase();
        switch(shape){
            case "rectangle":
                System.out.println("please enter width of rectangle");
                double w= input.nextDouble();
                System.out.println("please enter the length of rectangle");
                double l=input.nextDouble();
                System.out.println("the area of rectangle is: +(l*w )");
                break;
            case "triangle":
                System.out.println("please enter height triangle");
                double h=input.nextDouble();
                System.out.println("please enter base of triangle");
                double b= input.nextDouble();
                System.out.println("the area of triangle is: +((base*h)/2");
                break;
            default:
                System.out.println("your shape is not an option for us");


        }

    }
}
