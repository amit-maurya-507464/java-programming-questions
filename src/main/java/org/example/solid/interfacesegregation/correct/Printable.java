package org.example.solid.interfacesegregation.correct;

//Clients should not be forced to depend on interfaces they do not use. It’s better to have many small, specific interfaces than one large, general-purpose interface.
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class BasicPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Printing");
    }
}
