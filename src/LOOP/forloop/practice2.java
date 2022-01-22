package LOOP.forloop;

public class practice2 {
    public static void main(String[] args) {
        //print out every letter from the string
        //print index number of letter and +together with the letter>>0*t 1*0 2*d
        //print only y
        String str="today is snowy";


            System.out.println(str.charAt(0));
            System.out.println(str.charAt(1));
            System.out.println(str.charAt(2));

        for( int index=0 ; index<str.length()  ;index++   ){
            System.out.println(index+"*"+str.charAt(index));
        }

        for(int i=0;i<str.length();i++){
           if( str.charAt(i)=='y'){
               System.out.println(i+""+str.charAt(i));
           }
           //count the number of letter 'n' in the giving string
            //"there are....'n' in the string
            int count=0;
            for(int a=0;a<str.length();a++){
                if(str.charAt(a)=='n'){
                    count++;
                    System.out.println(count);
                }
            }
            System.out.println("there are "+count+" letter n in the string");
        }
    }
}
