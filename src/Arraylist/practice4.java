package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class practice4 {
    public static void main(String[] args) {
        List<Integer> ids=new ArrayList<>();
        ids.add(11);
        ids.add(22);
        ids.add(33);
        ids.add(44);
        //is empty()
        System.out.println(ids.isEmpty());//false


        //contains();
        System.out.println(ids.contains(22));//true
        System.out.println(ids.contains(88));//false


        //clear();--->it will remove all elements
        System.out.println(ids);
        ids.clear();
        System.out.println(ids.size());
        System.out.println(ids.isEmpty());//true
    }
}
