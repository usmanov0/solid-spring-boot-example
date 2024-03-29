package com.example.springbootsolid.liskov_substitution;

public class Square implements Shapes{
    private double length;
    private Printer printer;

    public Square(double length, Printer printer) {
        this.length = length;
        this.printer = printer;
    }
    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(length * length));
    }
}
