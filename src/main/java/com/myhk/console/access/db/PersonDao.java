package com.myhk.console.access.db;

/**
 * Created by Victor on 26/02/2017.
 */


public class PersonDao<T> implements IOlmsDao {
    @Autowired
    private HibernateUtil hibernateUtil;
    public Object getById(Class clazz, long id) {
        return hibernateUtil.find(clazz, id);
    }
    public Object getByName(Class clazz, String name) {
        return hibernateUtil.find(clazz, name);
    }
    public Object getByEmail(Class clazz, String email) {
        return hibernateUtil.find(clazz, email);
    }
    public List getAlls(Class clazz) {
        return hibernateUtil.fetchAll(clazz);
    }
    public void create(Object baseEntity) {
        hibernateUtil.create(baseEntity);
    }
    public void update(Object baseEntity) {
        hibernateUtil.update(baseEntity);
    }
    public void deleteById(Class clazz, long id) {
        hibernateUtil.delete(clazz);
    }
    public void deleteByName(Class clazz, String name) {
        hibernateUtil.delete(clazz);
    }
}