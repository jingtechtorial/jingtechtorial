package array;

public class foreachpractice2 {
    public static void main(String[] args) {
        char[] chs = {'A', '4', '&', 'z', '3', 'U', '*'};
        //by using for each loop , print out letter only
        for (char letter:chs){

            if(letter>='A' && letter<'Z' ||letter>='a' &&letter<='z'){
                System.out.println(letter);
            }

            System.out.println("*****************");
            for(char charac:chs){
              if(Character.isAlphabetic(charac)){
                  System.out.println(charac);
              }else if(Character.isDigit(charac)){
                  System.out.println("this is a digit" + charac);
              }

                }
            }
        }
    }

