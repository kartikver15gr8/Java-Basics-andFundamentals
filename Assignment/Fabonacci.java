package com.FirstJava.Assignment;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value upto which you want the fabonacci series: ");
        Scanner in = new Scanner(System.in);
        int n1 = 0,n2 = 1, n3,i;
        int num = in.nextInt();
        for (i = 0; i < num; ++i) {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
