package com.example.springbootsolid.single_responsibility;

public class ConsolePrinter implements Printer {

    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
