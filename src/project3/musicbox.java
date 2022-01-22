package project3;

import java.util.Locale;
import java.util.Scanner;

public class musicbox {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Available types of music are POP, Classical and Country. Please enter the music type");
    String genre = input.nextLine();
        if(genre.equalsIgnoreCase("country")){
        System.out.println("Your options are: Meant to be, Simple, One number away, Get Along, Heaven");
        System.out.println("Which song do you want to listen");
        String song = input.nextLine();
        if(song.equalsIgnoreCase("Meant to be" )||song.equalsIgnoreCase("One number away" ) ||
                song.equalsIgnoreCase("Simple" )||song.equalsIgnoreCase("Get Along" )
                ||song.equalsIgnoreCase("Heaven" )){
            System.out.println("Please enter 3$ for this song");
            int price = 3;
            input = new Scanner(System.in);
            int userMoney = input.nextInt();
            if(price <= userMoney){
                if(userMoney>price){

                    System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                            song + " is playing. Enjoy your song.");
                }else{
                    //exact amount of money
                    System.out.println(song + " is playing enjoy your song");
                }


            }else {
                // money country song


                while (userMoney<price){
                    System.out.println(userMoney + "  is not enough please add more ");
                    int userMoney2 = input.nextInt();
                    userMoney += userMoney2;
                    if(price == userMoney){
                        System.out.println(song + " is playing enjoy your song");
                    }else  if (price < userMoney){
                        System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                                song + " is playing. Enjoy your song.");
                    }
                }



            }

        }else{
            // type of song
            System.out.println(song + " is not available song");
        }

    }else if(genre.equalsIgnoreCase("pop")){

        // pop genre
        System.out.println("Your options are: Bad Guy, Talk, Please me, 7 ring, Without Me");
        System.out.println("Which song do you want to listen");
        String song = input.nextLine();
        if(song.equalsIgnoreCase("Bad Guy" )||song.equalsIgnoreCase("Talk" ) ||
                song.equalsIgnoreCase("Please me" )||song.equalsIgnoreCase("Without Me" )
                ||song.equalsIgnoreCase("7 ring" )){
            System.out.println("Please enter 4$ for this song");
            int price = 4;
            input = new Scanner(System.in);
            int userMoney = input.nextInt();
            if(price <= userMoney){

                if(userMoney>price){

                    System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                            song + " is playing. Enjoy your song.");
                }else{
                    //exact amount of money
                    System.out.println(song + " is playing enjoy your song");
                }

            }else {
                // money country song

                while (userMoney<price){
                    System.out.println(userMoney + "  is not enough please add more ");
                    int userMoney2 = input.nextInt();
                    userMoney += userMoney2;
                    if(price == userMoney){
                        System.out.println(song + " is playing enjoy your song");
                    }else  if (price < userMoney){
                        System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                                song + " is playing. Enjoy your song.");
                    }
                }



            }

        }else{
            // type of song
            System.out.println(song + " is not available song");
        }

    }else if(genre.equalsIgnoreCase("classical")){

        // classical genre
        System.out.println("Your options are: Four seasons, Finlandia, Fur Elise, Vocalise, The Planets ");
        System.out.println("Which song do you want to listen");
        String song = input.nextLine();
        if(song.equalsIgnoreCase("The Planets " )||song.equalsIgnoreCase("Fur Elise" ) ||
                song.equalsIgnoreCase("Finlandia" )||song.equalsIgnoreCase("Four seasons" )
                ||song.equalsIgnoreCase("Vocalise" )){
            System.out.println("Please enter 2$ for this song");
            int price = 2;
            input = new Scanner(System.in);
            int userMoney = input.nextInt();
            if(price <= userMoney){
                if(userMoney>price){

                    System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                            song + " is playing. Enjoy your song.");
                }else{
                    //exact amount of money
                    System.out.println(song + " is playing enjoy your song");
                }
            }else {
                // money country song

                while (userMoney<price){
                    System.out.println(userMoney + "  is not enough please add more ");
                    int userMoney2 = input.nextInt();
                    userMoney += userMoney2;
                    if(price == userMoney){
                        System.out.println(song + " is playing enjoy your song");
                    }else  if (price < userMoney){
                        System.out.println(" You have entered " + (userMoney-price) + " dollar more. please wait for the change "+
                                song + " is playing. Enjoy your song.");
                    }
                }



            }

        }else{
            // type of song
            System.out.println(song + " is not available song");
        }

    }


        else {
        // type of genre
        System.out.println("Type of music is not available");
    }


}
}

