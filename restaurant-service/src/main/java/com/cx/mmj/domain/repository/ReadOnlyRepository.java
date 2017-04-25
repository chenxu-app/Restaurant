package com.cx.mmj.domain.repository;

import com.cx.mmj.domain.model.entity.Entity;

import java.util.Collection;

/**
 * Created by cx on 2017/4/25.
 */
public interface ReadOnlyRepository<TE, T> {

    boolean contains(T id);

    Entity get(T id);

    Collection<TE> getAll();
}
