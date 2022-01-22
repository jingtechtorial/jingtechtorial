package object;

public class Testmath {
    public static void main(String[] args) {
        Mathpractice object=new Mathpractice();
        object.sum();
        object.total(4,5);
        object.total(10,5);
        object.sum2(2,3);
        int a= object.sum2(2,3);
       // System.out.println(object.sum());//we can not use method which has void return type in the sout()
        String str=object.speak();

        System.out.println(str);
        System.out.println(object.speak());//show the value

    //call numbertostring method, and do concatenation
    //with your first and last name and print out
    String num= object.numberToString(8.7);

}}
