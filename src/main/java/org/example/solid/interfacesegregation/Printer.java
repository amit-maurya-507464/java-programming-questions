package org.example.solid.interfacesegregation;


//A better design would be to create smaller interfaces:
interface Printer {
    void print();
    void scan();
    void fax();
}

class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
