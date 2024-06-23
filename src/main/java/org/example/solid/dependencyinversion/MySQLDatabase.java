package org.example.solid.dependencyinversion;


//A better design would use an interface to invert the dependency:
class MySQLDatabase {
    public void connect() {
        // Connection logic
    }
}

class Application {
    private MySQLDatabase database;

    public Application() {
        this.database = new MySQLDatabase();
    }

    public void start() {
        database.connect();
    }
}
