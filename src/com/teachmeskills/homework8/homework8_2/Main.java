package com.teachmeskills.homework8.homework8_2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printPosition("Director");
        worker.printPosition("Worker");
        accountant.printPosition("Accountant");

    }
}
