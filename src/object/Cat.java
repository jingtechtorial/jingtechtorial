package object;

public class Cat {
    String name;
    int age;
    String color;
    int foodAmount;
    //create a method named as run(),it will take a parameter as destination,
    //it will reduce food amount by 1 for every execution
    //it will print out as "Cat is running
    public void  run(String destination){
        foodAmount-=1;
        System.out.println(name+"is running to" + destination);
    }
//create a method name as setcolor(),it will take a parameter and initialize the color of cat
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="ginger";
        cat1.foodAmount=10;
        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.setcolor("white");
        System.out.println(cat1.color);
        System.out.println("this is coming from get color method"+cat1.getcolor());

    }




   // ==============================================================================
    public void setcolor(String newcolor){
        Cat cat1=new Cat();
        color=newcolor;
        cat1.setcolor("white");
    }
    //create a method that will return color of cat, name it as getcolor()
    public String getcolor(){
     return color;
    }
    //overload the run method with own references
    public void run(){
        System.out.println("cat is running");
    }

}


