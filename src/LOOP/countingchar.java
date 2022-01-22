package LOOP;

import java.util.Locale;
import java.util.Scanner;

public class countingchar {
    public static void main(String[] args) {
        /*cout letter,digits and other characters in the string
        string str=""
        sout("there are<>letter in the string");
        sout("there are<>digit in the string");
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please give a string value ");
        String str="$3%GTlK64mn^y?".toUpperCase();
        int index=0;
        int lettercounter=0,digitcounter=0,charcounter=0;
        do{
            if( str.charAt(index)>='A' && str.charAt(index)<='Z'){
                lettercounter++;
            }else if(str.charAt(index)>='0' && str.charAt(index)<='9'){
                digitcounter++;
            }else {
                charcounter++;
            }
            index++;
        }while(index<str.length());
        System.out.println(lettercounter);
        System.out.println(digitcounter);
        System.out.println(charcounter);

    }
}
