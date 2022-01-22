package array;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        //print out numbers that are greater than 10
        int[] largenumbers=new int[arr.length];

        for (int m = 0; m < arr.length; m++) {
            if (arr[m] > 10) {
                largenumbers[m]=arr[m];
               // System.out.println(arr[m]);

            }


        }
        System.out.println(Arrays.toString(largenumbers));
        Arrays.sort(largenumbers);
        System.out.println(Arrays.toString(largenumbers));
    }
}