package com.cx.mmj.domain.service;

import com.cx.mmj.domain.repository.Repository;

/**
 * Created by cx on 2017/4/25.
 */
public abstract class ReadOnlyBaseService<TE, T> {
    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
