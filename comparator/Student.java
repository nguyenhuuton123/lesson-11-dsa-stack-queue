package com.codegym.comparator;

public class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        // This keyword refers to current instance itself
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        // Returning attributes of Student
        return this.rollNo + " " + this.name + " " + this.address;
    }
}
