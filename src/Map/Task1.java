package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
     HashMap<Integer,String> cookies=new HashMap<>();
         cookies.put(8,"chocolate");
         cookies.put(2,"oreo");
         cookies.put(6,"browne");
         cookies.put(11,"browne");

      printkeys(cookies);
    }
    //create a method that will take a map <Integer,String> as a parameter
    // it will print out keys from that map one by one

    public  static void printkeys(Map<Integer,String> maps){
       for(Integer key:maps.keySet()){
           System.out.println(key);
       }

for(String value:maps.values()){
    System.out.println(value);
}
    }

}
