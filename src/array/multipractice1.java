package array;

public class multipractice1 {
    public static void main(String[] args) {
        //state of different regions in US
       // String[][] state1=new String[1][2];
        String[][] states={{"IL","OH"},{},{"CA","WA","OR","UT"}};
      for(String[] state:states){
          for(String st:state){
              System.out.println(st);
          }

      }
    }
}
