package com.cx.mmj.restaurant.domain.repository;

import java.util.Collection;

/**
 * Created by cx on 2017/4/25.
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

    boolean containsName(String name);

    public Collection<Restaurant> findByName(String name) throws Exception;
}
