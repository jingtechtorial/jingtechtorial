package String;



import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //by using scanner ask user to provide his/her gender, full name and birth year in the following format



       // F - Jenny Brown - 1999
           //     -check if the string starts with F
             //   -check if the string ends with M
             //   -check if the string contains your name
              //  -check if the string ending with birth year
       // -replace '-' with '/'
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the gender");
        System.out.println("please enter full name ");
        System.out.println("please enter the birth year");
        String name=scanner.nextLine();
        System.out.println(name.startsWith("F"));
        System.out.println(name.endsWith("M"));
        System.out.println(name.contains("your name"));
        System.out.println(name.endsWith("2000"));
        System.out.println(name.replace('-','/'));
    }

}
