package org.example.exception;


//@RestController
//@RequestMapping("/example")
public class ExampleController {

//    @GetMapping("/trigger-exception")
    public void triggerException() {
        // Simulate an exception
        throw new RuntimeException("This is a runtime exception.");
    }
}
