package array;

import java.util.Arrays;

public class binarypratice {
    public static void main(String[] args) {
        int[] numbers={4,6,10,23,1,12};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,23));

        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,50));//position , no exiting negative 7
        System.out.println(Arrays.binarySearch(numbers,3));
    }
}
