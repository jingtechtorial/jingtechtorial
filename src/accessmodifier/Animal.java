package accessmodifier;

public class Animal {
   public  String namepublic;
   private String colorprivate;
   protected int ageprotected;
   String breeddefault;
   public void speakpublic(){
      System.out.println("speaking");
      eatprivate();
   }
   private void eatprivate(){
       System.out.println("eat");
   }
    protected void runprotected(){
        System.out.println("running");
    }
    void sleepdefault(){
        System.out.println("sleeping");
    }

    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.eatprivate();


    }
}
