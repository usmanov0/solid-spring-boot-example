package com.example.springbootsolid.interface_segregation;

public class ConsolePrinter implements Printer{
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
