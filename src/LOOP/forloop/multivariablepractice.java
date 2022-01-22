package LOOP.forloop;

public class multivariablepractice {
    public static void main(String[] args) {
        for(int a=3,b=10; a<8 && b>0 ;a++,b-- ){
            System.out.println("a is >>>"+a);
            System.out.println("b is >>>"+b);

        }
        System.out.println("+++++++++++++++");
        int x=1;
        int y=5;
        for(  ;x<10 &&y>0;x++,y--){
            System.out.println("hello");
        }
        System.out.println("=================");
        for(x=1,y=5;x<10 || y>0 ; x++,y--){
            System.out.println("bye");
        }
        int k;
        for(x=1,y=5,k=9;x<10 && y>0;x++,y--,k++){
            System.out.println("k>>>"+k);

            String str=k>=y?"saturday":"sunday";
            System.out.println("str");
            System.out.println("$$$$$$$$$$$$$$$$$$");
        }
    }




}
