package array;

import java.util.Arrays;

public class sortpractice {
    public static void main(String[] args){
        int[] zipcode={61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipcode));
        Arrays.sort(zipcode);//it will arrange data ascending(from small-large)
        System.out.println(Arrays.toString(zipcode));


        String[] colors={"violet","pink","Red","white","black","red","brown","red"};
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));


    }
}
