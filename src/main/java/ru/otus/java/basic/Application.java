package ru.otus.java.basic;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demo();
        demo2();
    }

    public static void demo() {
        System.out.println("-----");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("-----");
    }

    public static void demo2() {
        System.out.println("-----");
        System.out.println("---" + 1);
        System.out.println("---" + 2);
        System.out.println("---" + 8);
        System.out.println("-----");
    }

    public static void demo3() {
        System.out.println("-");
    }
}
