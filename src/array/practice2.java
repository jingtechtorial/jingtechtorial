package array;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {

        int[] numbers={4,3,6,7,11,45};
        System.out.println(numbers[3]);
       // numbers[6]=66;
        numbers[1]=88;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        for(int m=0;m<numbers.length;m++){
            System.out.println(numbers[m]);
        }

    }
}
