package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Typeofmap {
    public static void main(String[] args) {
        HashMap<Integer,String> drinks1=new HashMap<>();

        LinkedHashMap<Integer,String> drinks2=new LinkedHashMap<>();

        TreeMap<Integer,String> drinks3=new TreeMap<>();

        drinks1.put(9,"water");    drinks2.put(9,"water");         drinks3.put(9,"water");
        drinks1.put(7,"coke");    drinks2.put(7,"coke");         drinks3.put(7,"coke");
        drinks1.put(11,"tea");    drinks2.put(11,"tea");         drinks3.put(11,"tea");
        drinks1.put(2,"coffee");    drinks2.put(2,"coffee");         drinks3.put(2,"coffee");
        drinks1.put(5,"pepsi");    drinks2.put(5,"peppsi");         drinks3.put(5,"peppsi");
        drinks1.put(null,"mineral water");  drinks2.put(null,"mineral water");  //drinks3.put(null,"water mineral");
        drinks1.put(22,null);     drinks2.put(22,null);     drinks3.put(22,null);
                                                             drinks3.put(33,null);

        System.out.println(drinks1);//hashmap
        System.out.println(drinks2);//linkehashdmap
        System.out.println(drinks3);//treemap
        System.out.println(drinks3.get(9));//water
// print out all values by using get method, create a new method for it
        System.out.println("*******************");
     printvalue(drinks2);

    }
    public static void printvalue(Map<Integer,String> storage){
        for(Integer drinkkey:storage.keySet()){
            System.out.println(storage.get(drinkkey));
        }
    }
}
