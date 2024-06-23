package org.example.solid.liskovsubsitution;


//A better design would be to separate the ability to fly into an interface that only flying birds implement:
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
    // Sparrow can fly, so no need to override the fly method
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }
}
