/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccas.models.entities.common;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Gayanj
 */
public interface BaseDAOInterface<T> {
    public Session getCurrentSession();

    public T getById(final Long id);

    public List<T> getAll();

    public void create(final T entity);

    public void update(final T entity);

    public void delete(final T entity);

    public void deleteById(final Long entityId);
}
