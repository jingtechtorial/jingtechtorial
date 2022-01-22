package String;

public class Methodtask2 {
    public static void main(String[] args) {

       // String str = " Zero to Ten  ";
       // - change 'Ten' with/to 'HERO'
        //        - make all of the string uppercase
         //       - remove all spaces
       // - get only first three letter
      //  - print the length of those three letters as ==> "The length of final verison is: +  <length>"
      String str =" Zero to Ten  ";

        System.out.println(str.replace("Ten",("HERO")));
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(0,3));
        int x=str.length();
        System.out.println("the length of version is :" + x);

        str=" Zero to Ten ";
        System.out.println(str.replace("Ten","HERO").toUpperCase().trim().replace("","").substring(0,3).length());





    }
}
