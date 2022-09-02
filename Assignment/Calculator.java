package com.FirstJava.Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        int mul = a*b;
        int div = a/b;
        int sub = a-b;
        if(a>0 || b>0){
            System.out.println(sum);
            System.out.println(mul);
            System.out.println(div);
            System.out.println(sub);

        }

    }
}
