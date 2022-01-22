package wrapper;

public class Stringtoprimitive {
    public static void main(String[] args) {
        String str="12";
        System.out.println(str+10);
      int number=  Integer.parseInt(str);
        System.out.println(number+10);
        int number1= Integer.parseInt(str);

        System.out.println(number==12);
      //"128"
      byte by=  Byte.parseByte("127");
        System.out.println(by);

        //int number2=Integer.parseInt("128GB");//numberformatexception

      boolean bl=  Boolean.parseBoolean("true");
        System.out.println(bl);
        boolean bl1=  Boolean.parseBoolean("TRUE");
        System.out.println(bl1);
        boolean bl2=Boolean.parseBoolean("True");
        System.out.println(bl2);
        boolean bl3=Boolean.parseBoolean("example");
        System.out.println(bl3);
        boolean bl4=Boolean.parseBoolean(" true");
        System.out.println(bl4);
     float fl=  Float.parseFloat("1.2");
        System.out.println(fl);
        float fl1=Float.parseFloat("2.3f");
        System.out.println(fl1);

    }
}
