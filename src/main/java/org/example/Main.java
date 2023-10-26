package org.example;

public class Main {
    void print(Object t) {
        System.out.println("Object");
    }
    void print(String t) {
        System.out.println("String");
    }
    public static void main(String[] args) {
        new Main().print(null);
        System.out.println("Hello world!");
    }
}