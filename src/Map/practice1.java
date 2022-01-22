package Map;

import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        HashMap<String,String> cityzipes=new HashMap<>();
        //keyset()return the set object with contains all the keys in the map
        cityzipes.put("chicago","6001");
        cityzipes.put("Des Plains","6002");
        cityzipes.put("Lake Forest","6003");
        cityzipes.put("Addison","6004");
        System.out.println(cityzipes);
        System.out.println(cityzipes.keySet());
        Set<String> cityname=cityzipes.keySet();
        System.out.println(cityname);
        //get("Addison")----"6004"
        //print all the values from the map by using keySet that we stored in the set above
        cityzipes.get("Addison");
        System.out.println("Addison");
        for(String name:cityname){

                System.out.println(cityzipes.get(name));

            }
        //values()
        cityzipes.values();
        System.out.println(cityzipes.values());

      Collection values= cityzipes.values();
        System.out.println(values);

        //entrySet
        System.out.println(cityzipes);
       // cityzipes.entrySet();
        System.out.println(cityzipes.entrySet());
        Set entries=cityzipes.entrySet();
        Set <Map.Entry<String,String>> entries1=cityzipes.entrySet();
        System.out.println(entries);







        }

    }

