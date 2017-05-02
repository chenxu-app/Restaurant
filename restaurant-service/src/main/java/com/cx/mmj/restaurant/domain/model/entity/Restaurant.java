package com.cx.mmj.restaurant.domain.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx on 2017/4/24.
 */
public class Restaurant extends BaseEntity<String> {

    private List<Table> tables = new ArrayList<>();
    private String address;

    /**
     * @param name
     * @param id
     * @param address
     * @param tables
     */
    public Restaurant(String name, String id, String address, List<Table> tables) {
        super(id, name);
        this.address = address;
        this.tables = tables;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public List<Table> getTables() {
        return tables;
    }

    /**
     * @param tables
     */
    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    /**
     * Overridden toString() method that return String presentation of the
     * Object
     *
     * @return
     */
    @Override
    public String toString() {
        return new StringBuilder("{id: ").append(id).append(", name: ")
                .append(name).append(", address: ").append(address).
                        append(", tables: ").append(tables).append("}").toString();
    }
}
