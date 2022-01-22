package primitives;

public class Truthtable2 {
    public static void main(String[] args) {
        //age 6> ,and height is 48
        int age=6;
        int height=48;
        int myage=6;
        int myheight=49;
     boolean pass=   age>=myage || height>=myheight;
        System.out.println(pass);

        // find out if student can pass the class
        //there are 3 test taken
        //average of test has to be more 70
        //attendance rate has to be 80% or more
        int test1=80 ,test2=75, test3=85;
        int average=(test1+test2+test3)/3;
        int retest=70;
        int att=80;
        int myatt=80;
        int mytest=85;
       boolean passmy= average>=retest && att>=myatt;
        System.out.println(passmy);

    }
}
