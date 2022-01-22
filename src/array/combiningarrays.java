package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class combiningarrays {
    public static void main(String[] args) {
        int[] num1={3,4,5};
        int[] num2={6,7,8,9};
        //combine these two arrays in to anther array
        int[] result=new int[num1.length+num2.length];
        for(int a=0;a<num1.length;a++){
            result[a]=num1[a];
        }
        System.out.println(Arrays.toString(result));
        for(int b=num1.length,c=0;b<result.length;b++,c++){
            result[b]=num2[c];
        }
        System.out.println(Arrays.toString(result));
    }


}
