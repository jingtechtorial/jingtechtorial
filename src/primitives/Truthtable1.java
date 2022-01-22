package primitives;

public class Truthtable1 {
    public static void main(String[] args) {
        //visa and ticket
        boolean visa=true;
        boolean ticket=true;
        boolean myvisa=false;
        boolean myticket=true;
       boolean  cantravel= visa==myvisa && ticket==myticket;
        System.out.println(cantravel);


        //ask question
        boolean onlineclass=true;
        boolean oncampus=true;
        boolean student=true;
      boolean  askquestion=student==onlineclass||student==oncampus;
        System.out.println("can i ask question");//true

        //%90 and more attendance and score of 80 and more to pass this class
        int reattendance=90;
        int rescore=80;
       int myattendance=100;
        int myscore=90;
       boolean pass= myattendance>=reattendance&& myscore>=rescore;
        System.out.println(pass);
    }
}
