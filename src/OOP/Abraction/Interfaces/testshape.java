package OOP.Abraction.Interfaces;

public class testshape {
    public static void main(String[] args) {
        Shape shape=new Triangle(4,5,6,8);
         shape.getaArea();
        System.out.println(shape.getaArea());
    Triangle triangle=new Triangle(1,1,1,1);
    triangle.getaArea();
        System.out.println(triangle.getaArea());
    }
}
