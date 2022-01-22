package object;

public class overloadpractice {
    //find sum of two number
    public void sum(int num1,int num2){
        System.out.println("sum is :" +(num1+num2));
    }
    public void sum(int[] numbers){
        int sum=0;
        for(int number:numbers){
            sum=sum+number;

        }
        System.out.println("sum of array elements: " +sum);
    }
    public void sum(String somthing,int number1,int number2){
        System.out.println(somthing + (number1+number2));

    }
}
