package String;

public class Methodchainning {
    public static void main(String[] args) {
        String name="             David  ";
     char n=   name.substring(5).substring(2).toUpperCase().replace("a","xxx").trim().charAt(1);
        System.out.println(n);

    }
}
