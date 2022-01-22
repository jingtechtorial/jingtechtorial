package Arraylist;

import java.util.ArrayList;

public class Flower {

        String color;
        String name;
        double price;

      public Flower(String name,String color,double price){
        this.color=color;
        this.name=name;
        this.price=price;

          }


    //create a method that will take a parameter as ArrayList of flowers
//this method will retrun total price of the flower





    public static double totalprice(ArrayList<Flower> vase) {
         double sum = 0;
        for (Flower flower : vase) {
            sum+= flower.price;
        }

        return sum;
    }
    }

