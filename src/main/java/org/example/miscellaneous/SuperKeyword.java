package org.example.miscellaneous;

class Parent {
  int num = 10;

  Parent() {
    System.out.println("Parent constructor");
  }
  void display() {
    System.out.println("Parent Class Num: " + num);
  }
}


class Child extends Parent {
  int num = 20;
  Child() {
    super();
    System.out.println("Child constructor");
  }

  Child(String a) {
    this();
    System.out.println("Parameterised Child constructor");
  }

  void display() {
    System.out.println("Child Class Num: " + this.num);
    System.out.println("Parent Class Num: " + super.num);
    super.display();
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Child child = new Child("s");
    child.display();
  }
}