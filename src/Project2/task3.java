package Project2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please give an amount in dollars ?");
        double total= input.nextDouble();
        double result=total*100;//cents
        int result1=(int)result;
        int quarters=result1/25;//quarter
        int remainder1=result1%25;
        int dimes=remainder1/10;
        int remainder2=remainder1%10;
        int nickles=remainder2/5;
        int remainder3=remainder2%5;
        int pennies=remainder3/1;
        System.out.println(total +"will make " +quarters +"quarters " +dimes +" dimes " +nickles +"nickle " +pennies +
                "pennies");








    }
}
