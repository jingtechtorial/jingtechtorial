package primitives;

public class Compoundassigments {
    public static void main(String[] args){
        // += -= *= %=
        int num1=7;
        int num2=num1+7;
        num1+=num2;
        System.out.println(num1);//21
        System.out.println(num1);
        num2=8;
        System.out.println(num2);//6

        int num3=num1+num2;
        num2+=num3;
        num1+=num3;
        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);

        //*=
        num1=4;
        num1*=5;
        System.out.println(num1);
        // /=
        num1 /=4;
        System.out.println(num1);
        //%=
        num1%=2;//num%2====5%2=1
        //cannot use compound assignment on the boolean.l1+=false;





        char ch1='a';
    char ch2='m';
    char ch3='t';
    ch1-=9;
    System.out.println(ch1);
    int remainder=ch1%3;
        System.out.println(remainder);
        ch1%=2;
        System.out.println(ch1);









}


}
