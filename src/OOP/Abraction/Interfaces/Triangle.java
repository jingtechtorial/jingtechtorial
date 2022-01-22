package OOP.Abraction.Interfaces;

public class Triangle implements Shape{
    double base;
    double height;
    double side1;
    double side2;

    @Override
    public Number getaArea() {
        double area=base*height/2;
        return area;
    }

    @Override
    public int getPerimeter() {
        double pre=base+side1+side2;
        return (int)pre;
    }
    private void walk(String direction){
        System.out.println("i am walking to "+ direction);
    }

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
}

