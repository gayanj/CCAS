/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.controllers;

import com.ccas.models.services.role.RoleServices;
import java.util.List;

/**
 *
 * @author Gayan
 */
public class RoleController {
    RoleServices roleServices = new RoleServices();
    
    public List<String> getRolesRequest(){
        return roleServices.getRoles();
    }
}
