package OOP.FinalPractice;

public final class Tshirt extends Shirt {
    String name ;
   /* public void wash(){
        System.out.println("you can wash this Tshirt");
    }*/
    //you cant override final method
    public boolean fit(char size){
        return true;
    }
}
