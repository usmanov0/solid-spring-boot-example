package com.example.springbootsolid.interface_segregation;

public class Sphere implements CircumferenceShape{
    private double radius;
    private Printer printer;

    public Sphere(double radius, Printer printer) {
        this.radius = radius;
        this.printer = printer;
    }
    @Override
    public void calculateCircumference() {
        printer.printValue(String.valueOf(Math.PI * 2 * radius));
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(4 * Math.PI * radius * radius));
    }
}
