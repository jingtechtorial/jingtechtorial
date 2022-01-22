package array;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // /*
        //        ask user,how many names that s/he wants to store in array
        //        store thoes names by getting it from user in to array
        //if the name has 5 or more letters store it in"longname" array
        //if the name has less than 5 letters store it on "shortnames" array
        //        print them out by using --arrays.tostring();
        //         */
        Scanner input=new Scanner(System.in);
        System.out.println("how many name you want to store");
        int number=input.nextInt();
        String[]names=new String[number];
        String[]longnames=new String[number];
        String[]shortnames=new String[number];
        input=new Scanner(System.in);
        for(int i=0;i<number;i++){
            System.out.println("enter" +(i+1)+".name");
          String name=  input.nextLine();
            if(name.length()>=5){
                longnames[i]=name;
            }else{
                shortnames[i]=name;
            }

        }
        System.out.println(Arrays.toString(longnames));
        System.out.println(Arrays.toString((shortnames)));

    }
}
