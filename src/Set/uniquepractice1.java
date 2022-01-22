package Set;

import java.util.*;

public class uniquepractice1 {
    public static void main(String[] args) {
        String[] letter = {"a", "b", "c", "d","d","t","t"};
        //store these elements in to a set
        List listofletter=Arrays.asList(letter);
      //  listofletter.add("t");
       TreeSet setofletter = new TreeSet(listofletter);
       setofletter.add("x");
       setofletter.add("t");
        System.out.println(setofletter);
        System.out.println(listofletter);
        System.out.println(setofletter);
        System.out.println(setofletter);
       HashSet set=new HashSet(Arrays.asList(letter));
       ArrayList duplicate=new ArrayList();

       String[] letter1={"a","a","b","c","d","d","d"};
       HashSet<String> hashset=new HashSet<>();
      for(String lt:letter1){
          if(!hashset.add(lt)){
              System.out.println("this is repeating element " + lt);
              duplicate.add(lt);
          }

      }
        System.out.println(hashset);

    }
}