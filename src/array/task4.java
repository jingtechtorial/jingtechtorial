package array;

public class task4 {
    public static void main(String[] args) {
        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55,-1};
        //can you find sum of numbers which are less than10 from array
        int total=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<10){
              total= total + arr[i];
            }
        }
        System.out.println(total);
        }

    }

