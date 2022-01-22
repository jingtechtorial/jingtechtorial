package array;

public class foreachpractice1 {
    public static void main(String[] args) {
        double[] checks={2540,10000,100000,65.50,1.99};
        //by using fpr each loop, find and print out the total amonut of checks
        double sum=0;
        for(double check:checks){
            //System.out.println(check);
            sum+=check;
            System.out.println(sum);
        }
    }
}
