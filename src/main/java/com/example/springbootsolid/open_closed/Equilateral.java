package com.example.springbootsolid.open_closed;

public class Equilateral extends AbstractTriangle{
    public Equilateral(double height, double base, Printer printer) {
        super(height, base, printer);
    }

    @Override
    public void getAllSides() {
        printer.printValue(String.valueOf(base));
        printer.printValue(String.valueOf(base));
        printer.printValue(String.valueOf(base));

    }
}
