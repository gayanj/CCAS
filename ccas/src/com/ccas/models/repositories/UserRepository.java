/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.repositories;

import com.ccas.models.entities.User;
import com.ccas.models.entities.common.BaseDAOImplementation;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gayanj
 */
public class UserRepository extends BaseDAOImplementation<User> implements UserRepositoryInterface {

    @Override
    public User getUserByUsernamePassword(String username, String password) {
        Criteria cr = getCurrentSession().createCriteria(User.class);
        Criterion usernameCr = Restrictions.eq("username", username);
        Criterion passwordCr = Restrictions.eq("password", password);
        LogicalExpression andExp = Restrictions.and(usernameCr, passwordCr);
        cr.add(andExp);
        List result = cr.list();
        if (result != null && result.size() > 0) {
            return (User) result.get(0);
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        Criteria cr = getCurrentSession().createCriteria(User.class);
        return cr.list();
    }

    @Override
    public User getUserByUsername(String username) {
        Criteria cr = getCurrentSession().createCriteria(User.class);
        cr.add(Restrictions.eq("username", username));
        List result = cr.list();
        if (result != null && result.size() > 0) {
            return (User) result.get(0);
        }
        return null;
    }
}
