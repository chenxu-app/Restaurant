package com.cx.mmj.booking.domain.service;

import com.cx.mmj.booking.domain.repository.Repository;

/**
 * @param <TE>
 * @param <T>
 * @author Sourabh Sharma
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
