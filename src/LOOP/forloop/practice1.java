package LOOP.forloop;

public class practice1 {
    public static void main(String[] args) {
        //print out number between 0-5 decreasing by using for loop

        for(  int a=5 ;a>=0   ;a--){
            System.out.println(a);
        }
        //find the total of numbers between 1 to 5 by using for loop
        int sum=0;
        for(int num2=1 ;num2<5;num2++){
            System.out.println(sum);
            sum+=num2;
        }
        System.out.println("final total>>" +sum);
    }
}
