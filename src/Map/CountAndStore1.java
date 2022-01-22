package Map;

import java.util.HashMap;

public class CountAndStore1 {
    public static void main(String[] args) {
        String string ="Ping Pong";
        /*take p,1
               i,1

         */
        HashMap<Character,Integer> lettercount=new HashMap<>();
        for(int i=0;i<string.length();i++){
            if(!lettercount.containsKey(string.charAt(i))){
                lettercount.put(string.charAt(i),1);

            } else{
                lettercount.put(string.charAt(i),lettercount.get(string.charAt(i))+1);
            }
        }
        System.out.println(lettercount);
    }
}
