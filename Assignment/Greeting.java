package com.FirstJava.Assignment;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + " let's crack DSA!!");
    }
}
