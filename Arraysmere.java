package com.FirstJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraysmere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println("Enter the number of elements in array:");
        int n1 = in.nextInt();
        System.out.println("Enter the sum you want:");
        int s = in.nextInt();
        int[] arr = new int[n1];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == s) {
                    ans.add(i);
                    ans.add(j);
                    System.out.println(ans);
                    System.out.println(i + " " + j);
                    
                }
            }
        }
    }
}
