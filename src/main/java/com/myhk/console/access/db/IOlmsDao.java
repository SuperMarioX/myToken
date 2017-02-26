package com.myhk.console.access.db;

import java.util.List;

/**
 * Created by Victor on 26/02/2017.
 */

public interface IOlmsDao<T> {
    // Get
    public T getById(Class<T> clazz, final long id);
    public T getByName(Class<T> clazz, final String name);
    public T getByEmail(Class<T> clazz, final String email);
    public List<T> getAlls(Class<T> clazz);
    // Create
    public void create(T baseEntity);
    // Update
    public void update(T baseEntity);
    // Delete
    public void deleteById(Class<T> clazz, final long id);
    public void deleteByName(Class<T> clazz, final String name);
}