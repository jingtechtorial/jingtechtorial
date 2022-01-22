package ametmentoring;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    //instance data(variable):is a variable that belongs to the class.(it is a way)
    //**initialize your object feature;
    String name;
    double salary;
    int workhours;
    int hireyear;

    //contructor is a way of initializing the instance variable
    public Employee(String name, double salary, int workhours, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }

    public double tax(double salary) {
        if (salary <= 1000) {
            return 0.0;
        } else {
            return salary * 0.03;
        }

    }

    int extrahour = workhours - 40;

    public double bonous(int workhours) {
        if (extrahour > 0) {
            return extrahour * 30;

        } else {
            return 0.0;
        }


    /*    public double inceasedsalary(){
            LocalDate now=LocalDate.now();
        int year=now.getYear()-hireyear;
            if (year <= 10) {
                return salary * 0.05;
            } else if (year >= 9 && year < 20) {
                return salary * 0.15;
            }
        }

        }
    public void information(Employee employee1){
        System.out.println("Name: "+ name);
        System.out.println("Salary " + this.salary);
        System.out.println("Work Hours "+ workhours);
        System.out.println("Hire Year " + hireyear);
        System.out.println("Tax :" + employee1.tax());
        System.out.println("Bonus :" + bonous());
        System.out.println("Increased Of Salary " + increasesalary());
        System.out.println("Salary with Tax and Bonus "+ ((salary- employee1.tax())+bonus()));
        System.out.println("Total salary with the Raise of Salary "+ (salary+increasesalary()));

     */
    }

}
