package org.example.exception;

// Custom Runtime Exception class
class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message) {
        super(message);
    }
}

// Example class that uses the custom runtime exception
class CustomRuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            int value = 10;
            if (value < 20) {
                throw new CustomRuntimeException("Value must be at least 20.");
            }
            System.out.println("Value is acceptable.");
        } catch (CustomRuntimeException e) {
            System.err.println("Custom Runtime Exception: " + e.getMessage());
        }
    }
}
