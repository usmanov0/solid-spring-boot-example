package com.example.springbootsolid.open_closed;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solid/ocp")
public class OCPController {
    @GetMapping(value = "/")
    public ResponseEntity ocp(HttpServletRequest request) {
        Printer printer = new ConsolePrinter();
        printer.printValue("===========Open/ Closed Principle (OCP)===========");

        Equilateral triangle = new Equilateral(4, 4, printer);
        printer.printValue("Triangle Equilateral Area.....");
        triangle.calculateArea();
        printer.printValue("Triangle Equilateral All Sides.....");
        triangle.getAllSides();

        AbstractTriangle scalene = new Scalene(6, 4, printer);
        printer.printValue("Triangle Scalene Area.....");
        scalene.calculateArea();
        printer.printValue("Triangle Scalene All Sides.....");
        scalene.getAllSides();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
