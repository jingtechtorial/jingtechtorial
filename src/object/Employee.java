package object;

public class Employee {
   /* create Employee_Class:
            `method: to update company budget
    `instance fields: --> id, name, budgetOfCompany, companyName
    `constractors: --> no args, one arg, multiple
    */
    String name;
    int id;
    double budgetofcompany;
    String companyname;


    public Employee(){
        System.out.println("this is no args");
    }
    public Employee(String name){
        System.out.println("this is one args");
    }
    public Employee(String name,int id){
        System.out.println("this is multiple args ");
    }

    public Employee(double budgetofcompany) {
        this.budgetofcompany = budgetofcompany;
    }

    public void setBudgetofcompany(double budgetofcompany) {
        this.budgetofcompany = budgetofcompany;
    }

    public void update(double  expense){
         budgetofcompany-=expense;

        }

    public static void main(String[] args) {
        Employee e1=new Employee("zack",34);
        e1.update(5000);
        e1.budgetofcompany=20000000000.0;
        System.out.println(e1.budgetofcompany);
        Employee e2=new Employee("david");
        //if you want to create an object with no argument constructor, there is no no argument constructor in the
        // class, you can not create an object by using default java constructor.
        // it will be gone after you create your own constructor
        Employee e3=new Employee("jack",35);

    }
}
