package object;

import java.util.Random;

public class Studentclass {
    String name;
    int age = 23;
    int id;

    public void setId(int number) {
        id = number;
    }

    public void study() {
        System.out.println(name + "is studying " + createhour() + "hours");
    }

    public void sleep() {
        System.out.println(name + "is sleeping" + createhour() + "hours");
    }

    public void reading() {
        System.out.println(name + "is reading" + createhour() + "hours");
    }

    public static void main(String[] args) {
        Studentclass std1 = new Studentclass();
        std1.name = "David";
        std1.study();
        std1.reading();
    }

    public static int createhour() {//non static method can be called without object
        Random random = new Random();
        return random.nextInt(12);

    }
}

  /*  public static void main(String[] args) {
        Studentclass std1 = new Studentclass();
        std1.name = "David";
        std1.study();
        std1.reading();
        System.out.println(createhour());
    }
}*/