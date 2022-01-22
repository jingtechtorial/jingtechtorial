package blocks;

public class Practice {

    String name;
    static  String color;
    String lastname;
    {   this.lastname="Karol" ;
        name="Joe";

        System.out.println("This is instance block ");
    }
   static {

        color="Orange";
       System.out.println("this is static block ");
    }

    public static void main(String[] args) {
        Practice o=new Practice();
        Practice o1=new Practice();
    }
}
