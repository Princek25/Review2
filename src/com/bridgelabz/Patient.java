package com.bridgelabz;
import java.util.Scanner;

class Patient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Patient Name");
        String name = sc.next();
        System.out.println("Enter Patient Age");
        int age = sc.nextInt();
        System.out.println("Enter Phone Number");
        int phone = sc.nextInt();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Department");
        String department = sc.next();
    }

    public void addingMultiplePatient() {
        System.out.println("Enter Details");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Your Name");
            String name = sc.next();
            System.out.println("Enter Your Age");
            int age = sc.nextInt();
            System.out.println("Enter Phone Number");
            int phone = sc.nextInt();
            System.out.println("Enter City");
            String city = sc.next();
            System.out.println("Enter State");
            String state = sc.next();
            System.out.println("Enter Department");
            String department = sc.next();
        }
    }
}
