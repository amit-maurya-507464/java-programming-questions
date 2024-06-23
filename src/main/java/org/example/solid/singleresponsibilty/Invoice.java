package org.example.solid.singleresponsibilty;

class Invoice {
    public void calculateTotal() {
        // Logic to calculate the total amount
    }
}

class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        // Logic to print the invoice
    }
}

class InvoiceSaver {
    public void saveToDatabase(Invoice invoice) {
        // Logic to save the invoice to the database
    }
}
