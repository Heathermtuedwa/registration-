

public class login {

    // Attributes
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellNumber;

    // Constructor
    public login(String firstName, String lastName,
                 String username, String password,
                 String cellNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    // Setter method
    public void setUsername(String username) {
        this.username = username;
    }

    // Check username
    public boolean checkUsername() {
        return username.contains("_") && username.length() <= 5;
    }

    // Check password complexity
    public static boolean checkPasswordComplexity(String password) {

        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
    }

    // Check cellphone number
    public boolean checkCellPhoneNumber() {
        return cellNumber.startsWith("+27") &&
               cellNumber.length() == 12;
    }

    // Register user
    public String displayFullName() {

        System.out.println(
                "Welcome " + firstName + " " + lastName +
                ". It is great to see you again."
        );

        if (checkUsername()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println(
                    "Username is not correctly formatted; " +
                    "please ensure that the username contains " +
                    "an underscore and is no more than five characters."
            );
        }

        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println(
                    "Password is not correctly formatted; " +
                    "please ensure that the password contains " +
                    "at least eight characters, a capital letter, " +
                    "a number, and a special character."
            );
        }

        if (checkCellPhoneNumber()) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println(
                    "Cell phone number incorrectly formatted " +
                    "or does not contain international code."
            );
        }

        return "User has been registered successfully.";
    }

    // Login status
    public String returnLoginStatus(boolean loginResult) {

        if (loginResult) {
            return "Successful login";
        } else {
            return "Failed login";
        }
    }
}