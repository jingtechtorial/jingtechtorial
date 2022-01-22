package primitives;

public class Comparisonpractice {
    public static void main(String[] args) {
        float fl=4;
        int i=4;
        //==
        System.out.println(fl==i);
        boolean comp1=fl==i;
        System.out.println(comp1);
        System.out.println(18==18);
        System.out.println('a'=='a');
        System.out.println("test"=="tesT");
        int num1=55;
        int num2=66;
     boolean  comp2=num1!=num2;
        System.out.println(comp2);
        System.out.println(18!=18);
        //<less than
        System.out.println(num1<num2);
        System.out.println(55<num1);
        System.out.println(num2<num1);
        System.out.println('c'<'c');
        System.out.println('c'<'d');

        System.out.println(num1>num2);
        System.out.println(num2>109);
        System.out.println(num2++>66);
        System.out.println(num2>66);

        //<= less than or equal
        num1=2;
        num2=3;
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(3<=num2);
        num1++;//num1=3
        System.out.println(num1<=num2);
        System.out.println(++num1<=++num2);
        //>= greater than or equals
        System.out.println(num2>=num1);
        System.out.println(7>=++num2+num2);


    }
}
