package org.example;

class A {

    int a = 10;

    void print() {
        System.out.println("Printing A");
    }
}

class B extends A{

    int a = 20;

    void print() {
        System.out.println("Printing B");
    }

    void print1() {
        System.out.println("Printing B1");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        A a = new B();
        a.print();
        System.out.println(a.a);
    }

}
