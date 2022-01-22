package primitives;

public class Logicalnegation {
    public static void main(String[] args) {
        boolean islighton=true;
        System.out.println(islighton);
        System.out.println(!islighton);
        System.out.println(5==5);
        System.out.println(!(5==5));

        boolean havemoney=false;
        havemoney=!havemoney;
        System.out.println(havemoney);
        System.out.println(!havemoney);
        System.out.println(">>>>>>"+havemoney);
        System.out.println(islighton==havemoney);
        System.out.println(!(islighton==havemoney));

    }
}
