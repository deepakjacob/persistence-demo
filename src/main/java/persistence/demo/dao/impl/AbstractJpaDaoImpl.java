package persistence.demo.dao.impl;

import persistence.demo.dao.Dao;
import persistence.demo.entity.Entity;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;

/**
 * Super class for all applications DAOs.
 *
 * @author Deepak Jacob
 */
public abstract class AbstractJpaDaoImpl<K, E extends Entity> implements
        Dao<K, E> {

    protected Class<E> entityClass;

    /**
     * TODO: Make sure that entity manager is thread safe
     */
    protected EntityManager entityManager;

    public AbstractJpaDaoImpl() {
        ParameterizedType genericType = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericType.getActualTypeArguments()[1];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public E save(E entity) {
        if (entity.getId() == null) {
            entityManager.persist(entity);
        } else {
            entityManager.merge(entity);
        }
        return entity;
    }

    @Override
    public void delete(E entity) {
        entityManager.remove(entity);
    }

    @Override
    public E findById(K id) {
        return entityManager.find(entityClass, id);
    }
}