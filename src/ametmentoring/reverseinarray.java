package ametmentoring;

public class reverseinarray {
    public static void main(String[] args) {
        /*print out each of the word and reverse them for array
        string example = hi guys how are you
         */
        //i need to access each of the words
        // i need to store these words and reverse th
            //I need to access each of the words
            //I need to store these words and reverse them?
            String example= "Hi guys how are you";

            String array[]= example.split(" ");

            for(int i=0 ; i<array.length;i++){
                String reverse="";
                for(int k=array[i].length()-1;k>=0;k--){
                    reverse+=array[i].charAt(k);
                }
                System.out.println(reverse);
            }

        }
        }


