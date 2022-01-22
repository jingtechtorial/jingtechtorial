package wrapper;

import object.Studentclass;

public class practice1 {
    public static void main(String[] args) {
        byte b=2;
        Byte bt=new Byte(b);
        System.out.println(bt);
        short s=7;
        Short sh=new Short(s);
        System.out.println(sh);
        char c='a';
        Character ch= new Character('a');
        System.out.println(ch);
        Integer interger=new Integer(4);
        Float fl=new Float(3.4);
        Double cb=new Double(4.5);
        Long lg=new Long(1134);

        boolean bl=new Boolean(true);
        System.out.println(bl);

        int i=new Integer(23);//unboxing-->when java coverts wrapper class to primitive data
        Integer number=3;//Auto boxing -->when you store primitive data to wrapper class object

        System.out.println(number.toString().concat("jkklljn"));

    }

}
