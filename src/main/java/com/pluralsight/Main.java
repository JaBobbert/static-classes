package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        NameFormatter formatter = new NameFormatter();

        System.out.println(formatter.format("Mr", "Jacob", "Tre", "Davis", "1st"));
    }
}
