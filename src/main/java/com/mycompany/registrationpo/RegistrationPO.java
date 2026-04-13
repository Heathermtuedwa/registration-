/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationpo;

public class RegistrationPO {

    private String name;
    private String surname;
    private String username;
    private String password;
    private String phone;

    private password passwordObj;

    public RegistrationPO(String name, String surname,
                        String username, String password,
                        String phone) {

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.phone = phone;

        passwordObj = new password(password);
    }

    public boolean checkUsername() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword() {
        return passwordObj.isValid();
    }

    public boolean checkPhone() {
        return phone.startsWith("+27") && phone.length() == 12;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}