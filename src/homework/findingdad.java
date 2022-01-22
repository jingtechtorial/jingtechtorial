package homework;

import java.util.Scanner;

public class findingdad {
    /* Using scanner ask user to provide the string value.
     Print "dad" if the given string contains the "dad",
      but where the middle 'a' char can be any char otherwise please do not print anything.
       Please look carefully examples below. Example: Input the year: testdadtest
       Output :dad Input the year: testd7dtest Output :dad Input the year:
        testdodtest Output :dad Input the year: testDudtest Output :dad
    * */



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string value");
        String word=input.nextLine();
        int a=1;
        int b=3;
        if(word.substring(b).contains("d") && word.substring(a+2).contains("d"))
        {
            System.out.println("dad");
        }

    }
}

