package object;

public class Netflix {
   /*  `create following instance fields in the NetFlix-Class
        -accountName, userName, monthlyData
    `create a method that will update monthlyData for every usage
    `make sure this method takes parameter for data usage,
    `run your code in a Test-Class

    */
    String accountname;
    String username;
 static int monthlydata=100;

    public static  void  usage(int useddata){
        monthlydata=monthlydata-useddata;
        System.out.println("you have left" +monthlydata+ "GB of monthly data");

    }

}
