package array;

import java.util.Arrays;

public class foreachloop3 {
    public static void main(String[] args) {
        String[] names={"john","Brian","easy","Nina","David"};
        //create e-mail address for each of the names in the array
        //john@gmail.com
        //if it is gmail email, store it in gmail.array
        //if it is yahoo email,store it in  yahoo array
        String[] gmail=new String[names.length];
        String[] yahoo=new String[names.length];
        for(String name:names){
            System.out.println(name+"@gmail.com");
            System.out.println(name.toUpperCase().concat("@yahoo.com"));

            }
        System.out.println("********************");
        for(int i=0;i<names.length;i++){
             gmail[i]=names[i]+"@gmail.com";
            yahoo[i]=names[i].toUpperCase().concat("@yahoo.com");

        }
        System.out.println(Arrays.toString(gmail));
        System.out.println(Arrays.toString(yahoo));
        }
        }


