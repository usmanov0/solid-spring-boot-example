package com.example.springbootsolid.open_closed;

public class ConsolePrinter implements Printer{
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
