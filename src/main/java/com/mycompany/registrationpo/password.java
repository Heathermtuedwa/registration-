/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationpo;

public class password {

    private String password;

    // Constructor
    public password(String password) {
        this.password = password;
    }

    // Check password complexity
    public boolean checkPasswordComplexity() {

        if (password.length() < 8)
            return false;

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c))
                hasCapital = true;

            if (Character.isDigit(c))
                hasNumber = true;

            if (!Character.isLetterOrDigit(c))
                hasSpecial = true;
        }

        return hasCapital && hasNumber && hasSpecial;
    }

    // Getter
    public String getPassword() {
        return password;
    }
}