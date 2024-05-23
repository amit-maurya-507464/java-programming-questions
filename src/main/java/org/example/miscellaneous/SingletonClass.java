package org.example.miscellaneous;

class Human {

    private static Human human = null;

    private String name;

    private Human(String name) {
        this.name = name;
    }

    public static Human getInstance() {
        if (human==null) {
            human = new Human("Amit");
        }
        return human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class SingletonClass {

    public static void main(String[] args) {

        Human human = Human.getInstance();
        System.out.println(human.getName());
    }

}
