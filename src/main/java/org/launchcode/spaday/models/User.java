package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "Field is required.")
    @Size(min = 5, max = 15, message = "Must be between 5 and 15 characters.")
    private String username;

    @Email(message = "Must be a valid Email address.")
    private String email;

    @NotBlank(message = "Field is required.")
    @Size(min = 6, message = "Must be at least 6 characters long.")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
