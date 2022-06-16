package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UnaryOperator<Double> addVat = price -> price * 1.20;
        Consumer<Double> print = toPrint -> System.out.printf("%.2f%n", toPrint);
        System.out.println("Prices with VAT:");

        Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(print);
    }
}
