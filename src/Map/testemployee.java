package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class testemployee {
    public static void main (String[] sfsbsng) {

        HashMap<Integer,Employee> mapofemployee=new HashMap<>();
        Employee e1=new Employee("Max","New York",21,1);
        Employee e2=new Employee("Tim","St Loius",22,2);
        Employee e3=new Employee("David","Denver",34,9);
        Employee e4=new Employee("John","New Mexico",43,19);


        mapofemployee.put(e1.id,e1);
        mapofemployee.put(e2.id,e2);
        mapofemployee.put(e3.id,e3);
        mapofemployee.put(e4.id,e4);
        System.out.println(mapofemployee);
        ArrayList<String> names=new ArrayList<>();
        for(Employee employee:mapofemployee.values()){
            names.add(employee.name);
            System.out.println(employee.name);
            System.out.println(employee.city.toUpperCase());
        }


    }
}
