/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.repositories;

import com.ccas.models.entities.User;
import com.ccas.models.entities.common.BaseDAOInterface;
import java.util.List;

/**
 *
 * @author Gayanj
 */
public interface UserRepositoryInterface extends BaseDAOInterface<User>{
    public User getUserByUsernamePassword(String username, String password);
    public List<User> getAllUsers();
    public User getUserByUsername(String username);
}
