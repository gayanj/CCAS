/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.services.role;

import com.ccas.models.entities.Role;
import com.ccas.models.repositories.RoleRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gayan
 */
public class RoleServices {
    RoleRepository repository = new RoleRepository();
    
    public List<String> getRoles(){
        List<String> roleNamesList = new ArrayList<>();
        for(Role role: repository.getAllRoles()){
            roleNamesList.add(role.getName());
        }
        return roleNamesList;
    }
}
