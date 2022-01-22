package primitives;

public class Homework3 {
    public static void main(String[] args) {
        int min=3456789;
        int day=min/60/24;
        int year=day/365;
        int leftday=day%365;


        System.out.println(min +"is approximately "+ year + " year" + leftday +" days ");
    }
}
