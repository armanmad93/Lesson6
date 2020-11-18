package com.company.Lesson6_7;

public class Main {

    public static void main(String[] args) {

        //7
        //Design classes for currencies - Dram, Ruble, Dollar
        //Design a class named CurrencyConverter which has methods names “convert” for each pair of currency
        //convert(Dram from, Ruble to)
        //convert(Dram from, Dollar to)
        //convert(Dollar from, Ruble to)
        //convert(Dollar from, Dram to)
        //convert(Ruble from, Dram to)
        //convert(Ruble from, Dollar to)

        CurrencyConverter currencyConverter = new CurrencyConverter();

        Dram dram = new Dram();
        Ruble ruble = new Ruble();
        Dollar dollar = new Dollar();

        System.out.println("1 dram is: " + currencyConverter.convert(dram, ruble) + " ruble");
        System.out.println("1 dram is: " + currencyConverter.convert(dram, dollar) + " dollar");
        System.out.println("1 dollar is: " + currencyConverter.convert(dollar, dram) + " dram");
        System.out.println("1 dollar is: " + currencyConverter.convert(dollar, ruble) + " ruble");
        System.out.println("1 ruble is: " + currencyConverter.convert(ruble, dram) + " dram");
        System.out.println("1 ruble is: " + currencyConverter.convert(ruble, dollar) + " dollar");

    }

}
