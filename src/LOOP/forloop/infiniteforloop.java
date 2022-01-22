package LOOP.forloop;

public class infiniteforloop {
    public static void main(String[] args) {
        for(int k=0;k<5;k++){
            System.out.println("David");
        }
        //infinite loop
        for( ; ; ){
            System.out.println("zack");
        }
       // System.out.println();this statemnent will not be reached out since there is infinite loop before it
    }

}
