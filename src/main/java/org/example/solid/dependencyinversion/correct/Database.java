package org.example.solid.dependencyinversion.correct;

//High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        // Connection logic
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}
