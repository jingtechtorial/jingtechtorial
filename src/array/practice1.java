package array;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[] studentids= new int[5];
        studentids[0]=21;
        studentids[1]=31;
        studentids[2]=41;
       // studentids[3]=51;
       // studentids[4]=61;
       // System.out.println(studentids);[I@e9e54c2
        //it will print out memory location for the array

        System.out.println(studentids[0]);
        System.out.println(studentids[1]);
        System.out.println(studentids[2]);
        System.out.println(studentids[3]);//0 reserve number
        System.out.println(studentids[4]);//0 default value

        studentids[1]=99;
        System.out.println(studentids[1]);

       // studentids[5]=51;
       // System.out.println(studentids[5]);
        System.out.println("****************");
        for(int i=0;i<studentids.length;i++){
            System.out.println(studentids[i]);
        }
        System.out.println(Arrays.toString(studentids));
        System.out.println(studentids);

    }
}
