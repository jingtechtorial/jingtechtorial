package OOP.Abraction.AbstractClasses;

public abstract class Student {

    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;

    }
  abstract  public void attend();

   abstract void watch();//not method body

    public void eat(){
        System.out.println("student is eating");
    }
    abstract void sleep(int hour);
}
