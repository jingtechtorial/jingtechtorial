package ametmentoring;

public class sumofall {
    public static void main(String[] args) {



    /*write a method that receive an integer array and find the even number total and find the sum of odd numbers
    and difference between them
    1,create a method
    2,find sum of even number
    3,find sum of odd number
    4,find the difference between them
    */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 65, 76};

    }
        public static int sumofall ( int[] array){
            int sumofeven = 0;
            int sumofodd = 0;
            int difference = 0;
            for (int number : array) {
                if (number % 2 == 0) {
                    sumofeven += number;
                } else if (number % 2 != 0) {
                    sumofodd += number;

                }
            }
            System.out.println(sumofeven);
            System.out.println(sumofodd);
            return sumofeven - sumofodd;
        }

    }
