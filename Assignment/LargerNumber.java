package com.FirstJava.Assignment;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        if(a>b){
            System.out.println("The value of a is greater than b!");
        }else {
            System.out.println("The value of b is greater than a!");
        }
    }
}
