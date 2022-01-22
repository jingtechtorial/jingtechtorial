package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class practice3 {
    //====task====
    //create an arraylist that will store 5 fruit names
    // print out stored value by using for loop

    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Pear");
        fruits.add("Kiwi");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        //create a method that will take arraylist as a parameter of fruits
        //this method will print out fruits if it has   more letters.

        printfruit(fruits);
        }

        public  static void printfruit(ArrayList<String> fruit){
        for(String fruits:fruit){
            if(fruits.length()>=5){
                System.out.println(fruits);

            }
        }
        }
        //create a method that will take arraylist as a parameter of fruits
    //this method will remove elements tha t has 4 or less letter from the arrayslist

public void removefruit(ArrayList<String> fruits){
        for(int i=0;i<fruits.size();i++) {
            if (fruits.get(i).length() <= 4) {
                fruits.remove(i);
            }
        }
            System.out.println(fruits);
        }
}



