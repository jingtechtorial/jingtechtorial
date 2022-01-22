package LOOP.forloop;

public class breakcontinue {
    public static void main(String[] args) {
        for(int i=0;i<20 ;i++){
            if(i<7)
                continue;
            System.out.println("============");
            for(int k=0;k<10;k++){
                if(k>5)
                    continue;
                System.out.println("i------>"+ i);
                System.out.println(("k-------->" + k));
                }



            }




        }
    }

