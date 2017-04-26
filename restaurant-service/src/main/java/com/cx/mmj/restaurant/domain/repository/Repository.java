package com.cx.mmj.restaurant.domain.repository;

/**
 * Created by cx on 2017/4/25.
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

    void add(TE entity);

    void remove(T id);

    void update(TE entity);
}
