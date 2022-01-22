package object;

public class methodtest {
    public static void main(String[] args) {
        methodpractice object=new methodpractice();
       // object.agecalculator(2000);
        int[] nums={1,2,3,4,5};
    double v= object.sum(nums);
        System.out.println(v);
        System.out.println(object.sum(nums));

        double w=object.sum(new int[] {1,2,3,4});
        System.out.println(w);
    }


}
