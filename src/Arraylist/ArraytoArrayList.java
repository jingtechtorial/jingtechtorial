package Arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {
    public static void main(String[] args) {
        int [] numbers={3,4,5,6};
     List<int[]> listNumbers=   Arrays.asList(numbers);

        Integer [] numbers1={3,4,5,6};
       List<Number> listnumbers1= Arrays.asList(numbers1);
        System.out.println(listnumbers1);
      //  System.out.println(listnumbers1.add(7));
        for(int[] i:listNumbers){
            System.out.println(Arrays.toString(i));
        }
    }

}

