/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.services.user;

import com.ccas.dtos.UserDTO;
import com.ccas.models.entities.User;
import com.ccas.models.repositories.RoleRepository;
import com.ccas.models.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gayanj
 */
public class UserServices {

    UserRepository userRepository = new UserRepository();
    RoleRepository roleRepository = new RoleRepository();

    public boolean checkUserCredentials(UserDTO user) {
        User userResults = userRepository.getUserByUsernamePassword(user.getUsername(), user.getPassword());
        return userResults != null;
    }
    
    public void createUser(UserDTO user){
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setRole(roleRepository.getRoleByName(user.getRole()));
        userRepository.create(newUser);
    }
    
    public List<String> getAllUsernames(){
        List<String> usernameList = new ArrayList<>();
        for(User user: userRepository.getAllUsers()){
            usernameList.add(user.getUsername());
        }
        return usernameList;
    }
    
    public UserDTO getUserByUsername(String username){
        User user = userRepository.getUserByUsername(username);
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setRole(user.getRole().getName());
        return userDTO;
    }
    
    public boolean editUser(UserDTO user){
        User userEdit = userRepository.getUserByUsername(user.getUsername());
        if(userEdit == null){
            return false;
        }else{
            userEdit.setPassword(user.getPassword());
            userEdit.setRole(roleRepository.getRoleByName(user.getRole()));
            userRepository.update(userEdit);
            return true;
        }
    }
    
    public boolean deleteUser(String username){
        User userEdit = userRepository.getUserByUsername(username);
        if(userEdit == null){
            return false;
        }else{
            userRepository.delete(userEdit);
            return true;
        }
    }
}
