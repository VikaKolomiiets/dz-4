package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Robot_Dream!");
        int n = new TaskFirst().printInt();
        printSecond(n);
    }
    public static void printSecond(int i) {
        System.out.format("~~~<%d>~~~%n", i);
    }
}
