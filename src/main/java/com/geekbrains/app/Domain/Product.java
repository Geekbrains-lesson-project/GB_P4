package com.geekbrains.app.Domain;

import java.util.List;

public class Product {
    private final int id;
    private final String title;
    private final double cost;

    public Product(int id, String title, double cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }



}
