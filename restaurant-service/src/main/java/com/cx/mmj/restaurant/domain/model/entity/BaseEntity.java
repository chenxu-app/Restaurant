package com.cx.mmj.restaurant.domain.model.entity;

/**
 * Created by cx on 2017/4/24.
 */
public class BaseEntity<T> extends Entity<T> {

    private boolean isModified;

    /**
     *
     * @param id
     * @param name
     */
    public BaseEntity(T id, String name) {
        super.id = id;
        super.name = name;
        isModified = false;
    }

    /**
     *
     * @return
     */
    public boolean isIsModified() {
        return isModified;
    }
}
