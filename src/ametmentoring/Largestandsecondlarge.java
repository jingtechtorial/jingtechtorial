package ametmentoring;

import java.util.Arrays;
import java.util.List;

public class Largestandsecondlarge {
    int [] array={100,300,200,450,350};

    //find the largest and second largest with the sort method from array
    // interview question
   // int [] array={100,300,200,450,350};
    //output:
    //the largest number=450 and secondlargest=350;
    public static void main(String[] args) {
        int [] array={100,300,200,450,350};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-2]);
        System.out.println(array[array.length-1]);
        System.out.println("***************");
        int largest=array[0];
        int secondlargest=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondlargest=largest;
                largest=array[i];
            }else if(array[i]>secondlargest && array[i]!=largest){
                secondlargest=array[i];
            }
        }
        System.out.println("the largest number =" + largest +" and secondl ="+secondlargest);
            }
        }


