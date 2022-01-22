package object;

public class Mathpractice {
    public void sum() {
        int a = 11;
        int b = 22;
        int sum = a + b;
        System.out.println(a + "+ " + b + "=" + sum);

    }


    public void total(int num1,int num2){
int total=num1+num2;
        System.out.println( num1+ "+" + num2 + "=" + total);
    }
    public int sum2(int number1,int number2){
    int result=number1+number2;
        System.out.println(number1+ "+" + number2 + "=" + result);
    return result;
    }
    public String speak(){
    String string="test";
    string=string.toUpperCase();
    int i=23;
    i++;
     return "this is an example of string return type";
    }
    public String numberToString(double d){
        return ""+d;
    }
}