package String;

import java.util.Scanner;

public class Methodtask {
    public static void main(String[] args) {
        //task:get string from user
        //print first, last, middle,second matching 'c',length,index of x
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a string value");
        String str=scanner.nextLine();
        System.out.println("the first letter is"+ str.charAt(0));
        System.out.println("the last letter is" +str.charAt(str.length()-1));
        System.out.println("the middle char is " +str.charAt(str.length()/2));
        System.out.println("Second matching c's index number is "+str.indexOf('c',str.indexOf("c")+1));
        System.out.println("the length of string is "+str.length());
        System.out.println("the index of 'x' is"+str.indexOf("x"));




    }
}
