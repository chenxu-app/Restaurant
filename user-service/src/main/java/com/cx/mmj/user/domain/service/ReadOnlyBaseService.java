package com.cx.mmj.user.domain.service;

import com.cx.mmj.user.domain.repository.Repository;

/**
 *
 * @author Sourabh Sharma
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
