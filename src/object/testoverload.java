package object;

public class testoverload {
    public static void main(String[] args) {
        overloadpractice obj = new overloadpractice();
        obj.sum("String example", 4, 5);
        obj.sum(new int[]{1, 2, 3});
        obj.sum(8, 9);
        Cat cat = new Cat();
        cat.run();

        methodpractice obj2 = new methodpractice();
        obj2.agecalculator(1900, "leo");


    }
}
