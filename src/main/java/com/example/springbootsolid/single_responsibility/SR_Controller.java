package com.example.springbootsolid.single_responsibility;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solid/srp")
public class SR_Controller {
    @GetMapping(value = "/")
    public ResponseEntity srp(HttpServletRequest request) {

        Printer printer = new ConsolePrinter();
        printer.printValue("===========Single Responsibility Principle (SRP)===========");

        Circle circle = new Circle(34,printer);
        printer.printValue("Circle Area...");
        circle.calculateArea();

        Triangle triangle = new Triangle(6,6,printer);
        printer.printValue("Triangle Area...");
        triangle.calculateArea();

        return new ResponseEntity("Ok", HttpStatus.OK);
    }
}
