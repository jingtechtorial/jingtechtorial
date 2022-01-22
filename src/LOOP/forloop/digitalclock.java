package LOOP.forloop;

public class digitalclock {
    public static void main(String[] args) {
        //print hours and mintues for 12 hours of a day
        //ex: 0:0 0:1 .....
    OUTER:
        for(int hour=0;hour<12;hour++){

         for(int mintues=0;mintues<=59;mintues++) {
             if(mintues>=10 && mintues<=12){
                 continue;
             }
             if(mintues>=30){
                 break OUTER;
             }
             System.out.println(hour+":"+mintues);
             for(int second=0;second<=59;second++){


                 System.out.println(hour+":"+mintues+":"+second);
             }

         }





        }
    }
}
