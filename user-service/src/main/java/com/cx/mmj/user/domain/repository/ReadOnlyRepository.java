package com.cx.mmj.user.domain.repository;

import com.cx.mmj.user.domain.model.entity.Entity;

import java.util.Collection;

/**
 * @param <TE>
 * @param <T>
 * @author Sourabh Sharma
 */
public interface ReadOnlyRepository<TE, T> {

    //long Count;

    /**
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     * @param id
     * @return
     */
    Entity get(T id);

    /**
     * @return
     */
    Collection<TE> getAll();
}
