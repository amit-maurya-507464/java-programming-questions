package org.example;

class A {

    void print() {
        System.out.println("Printing A");
    }
}

class B extends A{

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
    }

}
