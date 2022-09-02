package com.FirstJava.Assignment;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        float inr = input.nextFloat();
        float usd = inr/77.55f;
        System.out.print("The amount in USD is: ");
        System.out.print(usd);
        System.out.println(" US Dollars");
    }
}
