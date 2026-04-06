package ru.otus.java.basic;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demo();
        demo2();
    }

    public static void demo() {
        System.out.println("-----");
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println("----11");
    }

    public static void demo2() {
        System.out.println("-----");
        System.out.println("---" + 1);
        System.out.println("---" + 2);
        System.out.println("---" + 8);
        System.out.println("-----");
    }

    public static void demo3() {
        System.out.println(1);
        System.out.println("000-");
        System.out.println(1);
        System.out.println(200);
        System.out.println(3);
        System.out.println("000-");
    }

    public static void featureOne() {
        System.out.println("feature one start");
        System.out.println(1);
        System.out.println(2);
        int x = 10;
        System.out.println(x);
        int y = 20;
        int z = x + y;
        System.out.println(y);
        System.out.println(z);
        System.out.println("feature one end");
    }
}
