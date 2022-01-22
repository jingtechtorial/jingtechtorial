package LOOP.forloop;

public class monthofyear {
    public static void main(String[] args) {
        //print out months of the years 2020-2023
        //print out names of each month

        for (int years = 2020; years <= 2023; years++) {
            System.out.print(years + "---->");
            for (int months = 1; months <= 12; months++) {
                System.out.print(months + "");
                switch(months){
                    case 1:
                        for(int day=1; day<=31 ;day++){
                            System.out.println(months + day);
                        }
                        System.out.println("jan");
                        break;
                    case 2:
                        System.out.println("feb");
                        break;
                    case 3:
                        System.out.println("march");
                        break;
                    case 4:
                        System.out.println("april");
                        break;
                    case 5:
                        System.out.println("may");
                        break;
                    case 6:
                        System.out.println("june");
                        break;
                    case 7:
                        System.out.println("july");
                        break;
                    case 8:
                        System.out.println("august");
                        break;
                    case 9:
                        System.out.println("sep");
                        break;
                    case 10:
                        System.out.println("oct");
                        break;
                    case 11:
                        System.out.println("nov");
                        break;
                    case 12:
                        System.out.println("dec");
                        break;

                }
                    System.out.println();


                }
            }
        }
    }