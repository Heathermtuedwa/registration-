/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Student
 */
package com.mycompany.registrationpo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        String surname;
        String username;
        String password;
        String phone;

        boolean valid = false;

        // ================= REGISTRATION =================
        while (!valid) {

            System.out.println("\n=== Registration ===");

            System.out.print("Enter name: ");
            name = input.nextLine();

            System.out.print("Enter surname: ");
            surname = input.nextLine();

            System.out.print("Enter username: ");
            username = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            System.out.print("Enter phone (+27...): ");
            phone = input.nextLine();

            RegistrationPO reg = new RegistrationPO(name, surname, username, password, phone);

            boolean usernameOK = reg.checkUsername();
            boolean passwordOK = reg.checkPassword();
            boolean phoneOK = reg.checkPhone();

            // SHOW ALL ERRORS
            if (!usernameOK) {
                System.out.println("Username is wrong (must contain '_' and max 5 characters)");
            }

            if (!passwordOK) {
                System.out.println("Password is wrong (must be 8 chars, uppercase, number & special character)");
            }

            if (!phoneOK) {
                System.out.println("Phone number is not correct (must start +27 and be 12 digits)");
            }

            // SUCCESS ONLY IF ALL TRUE
            if (usernameOK && passwordOK && phoneOK) {

                System.out.println("Registration successful!");
                System.out.println("Welcome " + username);

                valid = true;

            } else {

                System.out.println("Please try again.\n");
            }
        }

        // ================= LOGIN =================

        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        login userLogin = new login(username, password);

        if (userLogin.loginUser(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Username or password incorrect.");
        }

        input.close();
    }
}