package com.FirstJava.Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        float p = in.nextFloat();
        System.out.print("Enter the rate: ");
        float r = in.nextFloat();
        System.out.print("Enter the time: ");
        float t = in.nextFloat();
        System.out.print("The simple interest is : ");
        float SimpleInterest = (p*r*t)/100;
        System.out.println(SimpleInterest);
    }

    public static class Calculator {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();

            if(a>0 || b>0){
                System.out.println("The addition of a and b is: "+ a+b);
            }
        }
    }
}
