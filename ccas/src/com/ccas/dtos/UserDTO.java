/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.dtos;

/**
 *
 * @author Gayan
 */
public class UserDTO {
    private String username;
    private String password;
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
