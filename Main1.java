 package com.example.project;

class InnerClass { // package-private class, not accessible outside 'com.example.project' package
    void display() {
        System.out.println("Hello from InnerClass");
    }
}

public class Main1 {

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.display();
    }
}