package String;

public class Basics {
    public static void main(String[] args) {
        String word="tech";
        System.out.println(word);
        String word2=new String("tech");
        System.out.println(word2);
        String word3="tech"+"techtorial";
        System.out.println(word3);

        System.out.println(word+"java");
        System.out.println(word+"77");
        System.out.println(word+7+8);//add number to the string
        System.out.println(word+(7-8));
        System.out.println(word+7*8);
        System.out.println(7+8+word+7+8);//15tech78
        word+="torial";//word=word+"torial"=techtorial
        System.out.println(word);
        word+=33;
        System.out.println(word);
        word+=33-11;
        System.out.println(word);







    }
}
