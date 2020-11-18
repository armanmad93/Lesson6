package com.company.Lesson6_7;

public class CurrencyConverter {

    //convert(Dram from, Ruble to)
    //convert(Dram from, Dollar to)
    //convert(Dollar from, Ruble to)
    //convert(Dollar from, Dram to)
    //convert(Ruble from, Dram to)
    //convert(Ruble from, Dollar to)

    public double convert(Dram dram, Ruble ruble) {
        return 1 / 6.17;
    }

    public double convert(Dram dram, Dollar dollar) {
        return 1 / 498.8;
    }

    public double convert(Dollar dollar, Ruble ruble) {
        return 75.86;
    }

    public double convert(Dollar dollar, Dram dram) {
        return 498.8;
    }

    public double convert(Ruble ruble, Dram dram) {
        return 6.17;
    }

    public double convert(Ruble ruble, Dollar dollar) {
        return 1 / 75.86;
    }

}
