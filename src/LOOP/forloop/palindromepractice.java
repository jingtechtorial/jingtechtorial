package LOOP.forloop;

public class palindromepractice {
    public static void main(String[] args) {
        //civic,ana
        String str="";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
          reverse+=str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("it is a palindrome string");
        }else {
            System.out.println("it is not a palindrome string");
        }
        //find out if give number is palindrome number or not
        int number=1234321;
        String str1=""+number;
    }
}
