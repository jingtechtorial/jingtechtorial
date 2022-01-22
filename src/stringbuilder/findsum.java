package stringbuilder;

public class findsum {
    public static void main(String[] args) {
        StringBuilder stringbuilder=new StringBuilder("TPO_9_i_2");
         sumof(stringbuilder);
    }
    //create a method to find sumof digits from a stringbuilder parameter
    public  static void  sumof(StringBuilder numbers){
        double sum=0;
        for(int i=0;i<numbers.length();i++){
            if(Character.isDigit(numbers.charAt(i))){
           String str= ""+numbers.charAt(i);
          double num= Double.parseDouble(str);
          sum+=num;
            }
        }
        System.out.println(sum);
    }

        }


