package LOOP.while_dowhile;

public class dowhile1 {
    public static void main(String[] args) {
        //find and show sum of the numbers between 10 to 20 by using do-while loop
        int num1=10;
        int num2=20;
        int sum=0;
        do{
         sum+=num1;
         num1++;

        }while(num1<=num2);
        System.out.println("sum is:"+sum);
    }
}
