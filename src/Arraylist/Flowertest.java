package Arraylist;


import java.util.ArrayList;

public class Flowertest {
    public static void main(String[] args) {
        Flower flower1 = new Flower("rose", "red", 12);
        Flower flower2 = new Flower("lily", "yellow", 11);
        Flower flower3 = new Flower("tulip", "pink", 13);

        ArrayList<Flower> flowerList = new ArrayList<>();
        flowerList.add(flower1);
        flowerList.add(flower2);
        flowerList.add(flower3);
        for (Flower flower : flowerList){
            System.out.println(flower.name + " is $ " + flower.price);
        }
       // System.out.println(totalprice(flowerList));
        double flowerCost=Flower.totalprice(flowerList);
        System.out.println("this is cost calculation from totalpricemethod" + flowerCost);
        //create a method that will take a parameter as ArrayList of flowers
//this method will retrun total price of the flower

    }
    double sum = 0;

    public   double totalprice(ArrayList<Flower> vase) {
        for (Flower flower : vase) {
            sum+= flower.price;
        }

return sum;
    }

}



