package array;

import java.util.Arrays;

public class biggestnumber {
    public static void main(String[] args) {
        int[] nums = {500,4, 24, 10, 100, 5, 78, 11, 25, 55};
        //find biggest number from array
        int biggest=nums[0];
        for(int k=1;k<nums.length;k++){
            if(biggest<nums[k]){
                biggest=nums[k];
            }

        }
        System.out.println(biggest);//
        System.out.println("*****************");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]);

    }
}
