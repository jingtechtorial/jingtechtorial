package primitives;

public class Castingpractice1 {
    public static void main(String[] args) {
        double number=3.45;
        float fl1=(float)number;
        long l1=(long)fl1;
        int i1=(int)l1;
        short sh1=(short)i1;
        byte by1=(byte)sh1;
        System.out.println(by1);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        int count=129;
        byte count2=(byte)count;
        System.out.println(+count);//129
        System.out.println(+count2);//-127




    }
}
