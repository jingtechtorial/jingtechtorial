package LOOP;

import java.util.Random;

public class randompractice {
    public static void main(String[] args) {
        Random random=new Random();


      int number=random.nextInt();
      int number1=random.nextInt(100);
        System.out.println(number1);
        int number2= random.nextInt(2);
        System.out.println(number2);

    }
}
