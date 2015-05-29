/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.controllers;

import com.ccas.dtos.UserDTO;
import com.ccas.models.services.user.UserServices;
import java.util.List;

/**
 *
 * @author Gayan
 */
public class UserController {
    
    UserServices userServices = new UserServices();
    
    public boolean checkUserCredentialsRequest(UserDTO user){
        return userServices.checkUserCredentials(user);
    }
    
    public boolean addUserRequest(UserDTO user){
        userServices.createUser(user);
        return true;
    }
    
    public List<String> getAllUsernamesRequest(){
        return userServices.getAllUsernames();
    }
    
    public UserDTO getUserByUsernameRequest(String username){
        return userServices.getUserByUsername(username);
    }
    
    public boolean editUserRequest(UserDTO user){
        return userServices.editUser(user);
    }
    
    public boolean deleteUserRequest(String username){
        return userServices.deleteUser(username);
    }
}
