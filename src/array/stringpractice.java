package array;

import java.util.Arrays;

public class stringpractice {
    public static void main(String[] args) {
        String[] names=new String[6];
        System.out.println(Arrays.toString(names));
        names[5]="Alex";
        names[4]="Dinara";
        names[2]="Ana";
        names[0]="Mary";
        System.out.println(Arrays.toString((names)));
        System.out.println(names[3]);
        //[Mary,Ana,Dinara,Alex]
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }

}
