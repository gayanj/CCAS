/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.repositories;

import com.ccas.models.entities.Role;
import com.ccas.models.entities.common.BaseDAOImplementation;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gayan
 */
public class RoleRepository extends BaseDAOImplementation<Role> implements RoleRepositoryInterface{ 

    @Override
    public Role getRoleByName(String name) {
        Criteria cr = getCurrentSession().createCriteria(Role.class);
        cr.add(Restrictions.eq("name",name));
        List result = cr.list();
        if (result != null && result.size() > 0) return (Role) result.get(0);
        return null;
    }

    @Override
    public List<Role> getAllRoles() {
        Criteria cr = getCurrentSession().createCriteria(Role.class);
        return cr.list();
    }
}
