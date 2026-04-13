/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationpo;

import java.util.Scanner;

public class RegistrationPO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Registration details
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Username (must contain an underscore and be no more than five characters):");
        String username = scanner.nextLine();

        System.out.println("Enter Password (must contain a capital letter, a number, a special character and be at least eight characters):");
        String password = scanner.nextLine();

        System.out.println("Enter Cell Phone Number (must start with +27):");
        String cellPhoneNumber = scanner.nextLine();

      
        login user = new login(firstName, lastName, username, password, cellPhoneNumber);

      
        String registrationMessage = user.displayFullName();
        System.out.println(registrationMessage);

        
        if (registrationMessage.equals("User has been registered successfully.")) {

            System.out.println("\nLogin");

            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            boolean loginResult =
                    loginUsername.equals(user.getUsername()) &&
                    loginPassword.equals(user.getPassword());

            String loginMessage = user.returnLoginStatus(loginResult);

            System.out.println(loginMessage);
        }

        scanner.close();
    }
}