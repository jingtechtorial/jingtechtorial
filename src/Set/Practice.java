package Set;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice {
    public static void main(String[] args) {
        HashSet <String> colorHash=new HashSet<>();
        LinkedHashSet <String> colorLinked = new LinkedHashSet<>();
        TreeSet<String> colorsTree=new TreeSet<>();

        colorHash.add("White");   colorLinked.add("White");         colorsTree.add("White");
        colorHash.add("Black");   colorLinked.add("Black");         colorsTree.add("Black");
        colorHash.add("Blue");    colorLinked.add("Blue");          colorsTree.add("Blue");
        colorHash.add("Purple");  colorLinked.add("Purple");        colorsTree.add("Purple");
        colorHash.add("Red");     colorLinked.add("Red");           colorsTree.add("Red");
        colorHash.add(null);        colorLinked.add(null);         //colorsTree.add(null);

        System.out.println(colorHash); //no order
        System.out.println(colorLinked); // insertion order
        System.out.println(colorsTree);  // ascending order

        System.out.println(colorsTree.descendingSet());
        Set<String> example=colorsTree.descendingSet();
        System.out.println(example);











    }
}
