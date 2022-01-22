package stringbuilder;

public class task {
  //  Task:create a method that will takes Stringbuilder as a parameter, this method will delete "dashes"(-) from it
// and return/show the word without dashes
//I-n-t-e-r-v-i-e-w interview



       public static void deletedash(StringBuilder string){
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='-'){
                string.deleteCharAt(i);
                i--;
            }
        }
           System.out.println(string);

       }

    public static void main(String[] args) {
        StringBuilder string1=new StringBuilder("i-n-t-e-r-v-i-e-w");
         deletedash(string1);
        System.out.println(string1);
    }

    }

