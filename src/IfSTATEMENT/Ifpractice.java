package IfSTATEMENT;

public class Ifpractice {
    public static void main(String[] args) {
         int applenumber=5;
         int orangenumber=10;
         //==
        System.out.println("i am about to create an IF block");
        if ( applenumber==orangenumber ) {
            System.out.println("i am so lucky today ! ");
        }
        if( applenumber!= orangenumber){
            System.out.println(" i am so happy today! ");

        }
        if(applenumber<=orangenumber){
            int sum=applenumber+orangenumber;
            System.out.println("you have "+ sum + "fruits");
        }
        System.out.println(" so far so good! ");
        if(applenumber>orangenumber){
            System.out.println(orangenumber*applenumber +"is in the false condition if block.that is why it will not show ");}
         int number=1234;
       // if(number){
       //     System.out.println(number);}number is not condition, will not compile
    }
}
