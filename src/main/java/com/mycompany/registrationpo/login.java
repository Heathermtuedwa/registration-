/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.registrationpo;

public class login {

    private String username;
    private String password;

    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }
}