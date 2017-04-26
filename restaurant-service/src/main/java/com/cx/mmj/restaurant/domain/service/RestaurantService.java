package com.cx.mmj.restaurant.domain.service;


import com.cx.mmj.restaurant.domain.model.entity.Entity;
import com.cx.mmj.restaurant.domain.model.entity.Restaurant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface RestaurantService {
    Collection<Restaurant> findByName(String name) throws Exception;

    Entity findById(String id) throws Exception;

    void add(Restaurant restaurant) throws Exception;

    void update(Restaurant restaurant) throws Exception;

    void delete(String id) throws Exception;

    Collection<Restaurant> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
