package Map;


import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String [] drinks={"coke","water","coke","coffee","ayran","water","ayran","ayran"};
      //  you want to store these drinks into a map with the amount that how many times that you see in the array


          //<key, Value>
         //coke 2
       // water 2
       // coffee 1
       // ayran 1

        HashMap<String,Integer> drinks1=new HashMap<>();
        for(String drink:drinks){
            if(!drinks1.containsKey(drink)) {
                drinks1.put(drink, 1);
            }else{
                drinks1.put(drink,drinks1.get(drink)+1);
            }

        }
        System.out.println(drinks1);

    }
}
