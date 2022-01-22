package String;



public class Method2 {
    public static void main(String[] args) {
        String flower="Rose";
      int indexofR=  flower.indexOf('R');
       int indexofR1= flower.indexOf("R");
        System.out.println("first implementation"+indexofR);
        System.out.println("second implementation"+indexofR1);
        System.out.println(flower.indexOf("o"));
        System.out.println(flower.indexOf("r"));//not matching char, return to -1
        System.out.println(flower.indexOf("os"));
        System.out.println(flower.indexOf("Rose"));
        System.out.println(flower.indexOf("se"));


        String object="umbrella";
        System.out.println(object.indexOf('l'));//5

        System.out.println(object.indexOf('r',6));
        System.out.println(object.indexOf('e',object.indexOf('e')+1));


        String sentence="I love lilies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

     //toUppercase()---makes you string as Uppercase
        System.out.println(sentence.toUpperCase());
        //toLowerCase()---make String as lowercase
        System.out.println(sentence.toLowerCase());
        // think about making single letter uppercase from a string
       String str="just do it ";
       //indexOf()----returning number
        // charAt()-----returning char
       char letter=str.charAt(str.indexOf("d"));
       String str2="";
       str2+=letter;
        System.out.println(str2.toUpperCase());








    }
}
