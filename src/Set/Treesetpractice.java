package Set;

import java.util.TreeSet;

public class Treesetpractice {
    public static void main(String[] args) {
        TreeSet<Integer> zipcode= new TreeSet<>();
        zipcode.add(44);
        zipcode.add(11);
        zipcode.add(22);
        zipcode.add(55);
        //first()
        System.out.println(zipcode.first());
        System.out.println(zipcode);
        zipcode.add(77);
        Integer i=zipcode.pollFirst();
        //last()
        System.out.println(zipcode.last());
        //pollFirst()
        zipcode.pollFirst();
        System.out.println(zipcode);
        //pollLast();
        zipcode.pollLast();
        System.out.println(zipcode);
        //descendingSet()
        System.out.println(zipcode.descendingSet());
    }
}
