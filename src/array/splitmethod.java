package array;

import java.util.Arrays;

public class splitmethod {
    public static void main(String[] args) {
        String str="Stay safe and healthy";
        String[] words=str.split(" ");
        System.out.println(str);
        System.out.println(Arrays.toString(words));
        //print out every single word as "...***"
        for(String x:words){
            System.out.println(x.concat("***"));
        }
        String[]word2=str.split("a",4);
        System.out.println(Arrays.toString(word2));
        System.out.println(word2.length);
        //12_17_2021
        String date="12_17_2021";
        String[] splitD=date.split("_");
        System.out.println(Arrays.toString(splitD));
        //12.17.2021
        String a="12.17.2021";
        String[] splita=a.split("\\.");
        System.out.println("this is for dot example "+Arrays.toString(splita));
        for(String d:splitD){
            System.out.println("\"something\"");
            //[12,17,2021]
            for(String element:splitD){
                System.out.println("\""+element+"\"");
            }
        }

    }
}
