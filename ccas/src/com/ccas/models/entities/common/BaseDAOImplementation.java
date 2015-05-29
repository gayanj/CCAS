/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.entities.common;

import com.ccas.models.entities.common.hibernateConfig.CCASHibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gayanj
 * @param <T>
 */
public class BaseDAOImplementation<T> implements BaseDAOInterface<T>{

    Session session = CCASHibernateUtil.getSessionFactory().openSession();
    private final Class<T> clazz;

    @Override
    public Session getCurrentSession() {
        return this.session;
    }
    
    public BaseDAOImplementation() {
        this.clazz = null;
    }

    public BaseDAOImplementation(final Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Override
    public T getById(final Long id) {
        return (T) this.getCurrentSession().get(this.clazz, id);
    }

    @Override
    public List<T> getAll() {
        return this.getCurrentSession().createQuery("from " + this.clazz.getName()).list();
    }
    
    @Override
    public void create(final T entity) {
        this.getCurrentSession().beginTransaction();
        this.getCurrentSession().persist(entity);
        this.getCurrentSession().getTransaction().commit();
    }

    @Override
    public void update(final T entity) {
        this.getCurrentSession().beginTransaction();
        this.getCurrentSession().merge(entity);
        this.getCurrentSession().getTransaction().commit();
    }

    @Override
    public void delete(final T entity) {
        this.getCurrentSession().beginTransaction();
        this.getCurrentSession().delete(entity);
        this.getCurrentSession().getTransaction().commit();
    }

    @Override
    public void deleteById(Long entityId) {
        this.getCurrentSession().beginTransaction();
        final T entity = this.getById(entityId);
        this.delete(entity);
        this.getCurrentSession().getTransaction().commit();
    }
}
