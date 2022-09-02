package com.FirstJava;

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Celcius = input.nextFloat();

        float fahrenheit = ((Celcius*9)/5) + 32;
        System.out.println("The temperature in fahrenheit is: " + fahrenheit);

    }
}
