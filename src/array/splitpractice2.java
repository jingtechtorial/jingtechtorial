package array;

import java.util.Arrays;

public class splitpractice2 {
    public static void main(String[] args) {
        String str="java";
String text ="";
 int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))|| str.charAt(i)==' '){
                text+=str.charAt(i);
                System.out.println();
            }

        }
        System.out.println(text);
        String[] words=text.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("****************************");

        }
    }

