package com.example.springbootsolid.liskov_substitution;

public class ConsolePrinter implements Printer{
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
