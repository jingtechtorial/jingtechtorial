package project5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a string");
        String value= input.nextLine().trim();
        String reversename="";
        for( int a=value.length()-1 ;a>=0   ;a--){
            reversename+=value.charAt(a);
        }
        System.out.println(reversename);
    }
}
