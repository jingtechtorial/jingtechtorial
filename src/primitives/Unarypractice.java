package primitives;

public class Unarypractice {
    public static void main(String[] args) {
        int studentnumber=25;
        System.out.println(studentnumber);
        studentnumber=studentnumber++;
        System.out.println(studentnumber);
        studentnumber=++studentnumber;
        System.out.println(studentnumber);
        int count=5;
        System.out.println(count++);
        System.out.println(++count);

        int name=25;
        System.out.println(name++);//shows 25 but it is 26
        System.out.println(name);
        name++;
        System.out.println(name);

        int sount=5;
        System.out.println(sount++);//shows 5, but it is 6

        System.out.println(++sount);
        int number=8;
        System.out.println(number--);//shows 8,but 7
      System.out.println(number--);//shows 7, but 6
                System.out.println(--number);//5

        number++;
        System.out.println(number++ +number++);//shows 13,but number++8
        int result=--number+--number+2-number++*2;//number shows 6, but number 7
        System.out.println(result);

        int a=++number;
        System.out.println(a);









    }}
