/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.repositories;

import com.ccas.models.entities.Role;
import com.ccas.models.entities.common.BaseDAOInterface;
import java.util.List;

/**
 *
 * @author Gayan
 */
public interface RoleRepositoryInterface extends BaseDAOInterface<Role>{
    public Role getRoleByName(String name);
    public List<Role> getAllRoles();
}
