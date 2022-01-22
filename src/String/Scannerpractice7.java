package String;

import java.util.Scanner;

public class Scannerpractice7 {
    public static void main(String[] args) {



        //-deposit money for David
        //create a new class: MoneyTransaction
        //David wants to deposit hispaychecks into his account and already has $200
       // He has 3 paychecks (610, 385, 975)
      //  he can only deposit one check at a time
     //           *Ask: "How much is Deposit amount?" every time he is making deposit
      //  after all of paycheks deposited in to account
       // he bought a phone for $599 and headphone for $299
              //  *Ask: How much is phone?
	//*Ask: How much is headPhone?
      //  Calculate his final money and print --> "Your final balance is <finalAmount>"

        double balance=200;//his initial amount in the account
        Scanner scanner=new Scanner(System.in);

        System.out.println("how much is deposit amount? please enter the amount");
        scanner.nextDouble();
        double firstcheck=scanner.nextDouble();
        balance+=firstcheck;
        System.out.println("how much is deposit amount?please enter the amount");
        double secondcheck=scanner.nextDouble();
        balance+=secondcheck;
        System.out.println("how much is deposit amount?please enter the amount");
        double thirdcheck=scanner.nextDouble();
        balance+=thirdcheck;
        System.out.println("how much is deposit amount? please enter the amount");
        double headphone$=scanner.nextDouble();
        balance-=headphone$;
        System.out.println("your final balance is");








    }
}
