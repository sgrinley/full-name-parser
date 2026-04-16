package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        String[] parts = fullName.split(" ");

        String firstName = parts[0];
        String middleName = "";
        String lastName;

        if (parts.length == 3) {
            middleName = parts[1];
            lastName = parts[2];
        } else {
            lastName = parts[1];
        }

        System.out.println("First name: " + firstName);

        if (middleName.isEmpty()) {
            System.out.println("Middle name: (none)");
        } else {
            System.out.println("Middle name: " + middleName);
        }

        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}