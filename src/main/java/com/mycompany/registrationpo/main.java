/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.registrationpo;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registration ===");

        // Collect user details
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username (must contain _ and be max 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter password (8+ chars, capital, number, special character): ");
        String password = scanner.nextLine();

        System.out.print("Enter cell phone number (e.g. +27838968976): ");
        String cellPhone = scanner.nextLine();

        // Create Registration object
        RegistrationPO reg = new RegistrationPO(
                firstName,
                lastName,
                username,
                password,
                cellPhone
        );

        // Attempt registration
        System.out.println("\n" + reg.registerUser());

        // Only proceed to login if registration is valid
        if (reg.checkUserName()
                && reg.checkPassword()
                && reg.checkCellPhoneNumber()) {

            // Create Login object
            login login = new login(
                    reg.getUsername(),
                    reg.getPassword(),
                    reg.getFirstName(),
                    reg.getLastName()
            );

            System.out.println("\n=== Login ===");

            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            // Display login result
            System.out.println(
                    "\n" + login.returnLoginStatus(
                            enteredUsername,
                            enteredPassword
                    )
            );
        }

        scanner.close();
    }

}
