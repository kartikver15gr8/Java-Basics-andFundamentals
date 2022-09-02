package com.FirstJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
//        float num = input.nextFloat();
//        System.out.println(num);

        // Type casting

        int num = (int) (97.93f); // This will only return the integer value from the float we gave, as we have the concept of type casting
        float numFl = (float) (4578.66689445); // This will take the double input and return the respective float input of that double
        System.out.println(num);
        System.out.println(numFl);

        // automatic type promotion in expressions
        int a = 259;
        byte b = (byte) (a); // 259%256 = 3
        System.out.println(b);
        
    }
}
