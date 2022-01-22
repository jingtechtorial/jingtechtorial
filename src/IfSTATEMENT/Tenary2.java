package IfSTATEMENT;

public class Tenary2 {
    public static void main(String[] args) {
        int a=3,b=5,k=7;
        //increments ++/decrements --
      int r1=  a>=k? a+k++: ++b+k;
        System.out.println(r1);//13
        int r2=k<++b?2* ++k-2:--k*2-1;
        System.out.println(r2);//11
        System.out.println(k>=b?"i got this":false);
        System.out.println("test".equals("test")?"TEST".toUpperCase(): 99);



    }
}
