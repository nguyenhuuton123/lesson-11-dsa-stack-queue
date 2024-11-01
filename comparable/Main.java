package com.codegym.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        Employee arr[] = new Employee[n];

        arr[0] = new Employee(1, "Ty", 17);
        arr[1] = new Employee(2, "Ty", 18);
        arr[2] = new Employee(3, "Dao", 15);

        // printing the array
        print(arr);
        System.out.println("------");

        // Sorting the array
        Arrays.sort(arr);

        // printing the array
        print(arr);
    }

    public static void print(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
