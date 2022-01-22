import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        //grade

                Scanner input=new Scanner(System.in);
                System.out.println("Please enter your grade in letter.");
                String grade="";
                grade =input.nextLine();
                //double value=0;
                if(grade.equals("A")){
                    System.out.println("4.0");}
                if(grade.equals("A-")){
                    System.out.println("3.7");}
                if(grade.equals("B+")){
                    System.out.println("3.3");}
                if(grade.equals("B")){
                    System.out.println("3.0");}
                if(grade.equals("B-")){
                    System.out.println("2.7");}
                if(grade.equals("C+")){
                    System.out.println("2.3");}
                if(grade.equals("C")){
                    System.out.println("2.0");}
                if(grade.equals("C-")){
                    System.out.println("1.7");}
                if(grade.equals("D+")){
                    System.out.println("1.3");}
                if(grade.equals("D")){
                    System.out.println("1.0");}
                if(grade.equals("F")){
                    System.out.println("0.0");}

            }
        }


