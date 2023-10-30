package org.example.exception;

// Custom Exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example class that uses the custom exception
class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new CustomException("Age must be at least 18 to access this content.");
            }
            System.out.println("You have access to the content.");
        } catch (CustomException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }
}
