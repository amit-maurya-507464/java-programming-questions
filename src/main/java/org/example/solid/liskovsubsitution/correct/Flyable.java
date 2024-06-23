package org.example.solid.liskovsubsitution.correct;

//Subtypes must be substitutable for their base types without altering the correctness of the program.
interface Flyable {
    void fly();
}

class Bird {
    // Common bird properties
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    // Ostrich-specific properties
}
