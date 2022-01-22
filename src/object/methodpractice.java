package object;

import java.time.LocalDateTime;


public class methodpractice {

   /* `create a method that will calculate age of a person,
 	`does not return age,
            `will take birth year as parameter,
 	`user provides the birth year
 	`will print age of person

    */


    public int agecalculator(int birthyear, String name) {
        // Scanner scanner=new Scanner(System.in);
        //System.out.println("please enter your birthyear");
        // birthyear=scanner.nextInt();
        int age = LocalDateTime.now().getYear() - birthyear;
        System.out.println("your age is:" + age);
        return age;
    }


    //create a method that will take int array as a parameter
    //it will caculate sum of the numbers i this array
    // it will return the sum as couble

    public double sum(int[] ids ){
        methodpractice object=new methodpractice();
       double sum=0;
       for(int id:ids)
        sum+=id;
      return sum;





    }

}






