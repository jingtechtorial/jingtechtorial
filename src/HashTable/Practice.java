package HashTable;

import java.util.Hashtable;

public class Practice {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable= new Hashtable<>();
        hashtable.put(5,"cherry");
        hashtable.put(4,"kiwi");
        hashtable.put(1,"apple");
        System.out.println(hashtable);

        System.out.println(hashtable.get(2));//null
        System.out.println(hashtable.get(1));

        System.out.println(hashtable.keySet()); //set collection
        System.out.println(hashtable.values());
        System.out.println(hashtable.entrySet());

        //adding null key or null value
        //not store null key and null value


        Hashtable<String,String> hashtable1=new Hashtable<>();
        hashtable1.put("a","b");
        hashtable1.put("m","b");
        hashtable1.put("d","x");
        System.out.println(hashtable1);
    }

}
