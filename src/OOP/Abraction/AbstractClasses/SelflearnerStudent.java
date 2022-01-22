package OOP.Abraction.AbstractClasses;

public  class SelflearnerStudent extends Student{
      public void attend(){
          System.out.println("selflearner is attending");
      }

     void watch(){
         System.out.println("selflearner is watching");
     }


    public void sleep(int hour){
        System.out.println("self learner is sleeping");
    }

    public SelflearnerStudent(){
          super("Halicha",22);
    }


}
