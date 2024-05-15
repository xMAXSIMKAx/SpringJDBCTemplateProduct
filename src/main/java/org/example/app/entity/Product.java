package org.example.app.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Product {

    private Long id;
    private String name;
    private int quota;
    private long price;

    public Product() {
    }

    public Product(String name, int quota, long price) {
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    public Product(Long id, String name,int quota, long price) {
        this.id = id;
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product contact = (Product) o;

        if (!Objects.equals(id, contact.id)) return false;
        if (!Objects.equals(name, contact.name)) return false;
        if (!Objects.equals(quota, contact.quota)) return false;
        return Objects.equals(price, contact.price);
    }

    @Override
public int hashCode() {
    int result = id!= null? id.hashCode() : 0;
    result = 31 * result + (name!= null? name.hashCode() : 0);
    result = 31 * result + (Integer.valueOf(quota)!= null? Integer.valueOf(quota).hashCode() : 0);
    result = 31 * result + (Long.valueOf(price)!= null? Long.valueOf(price).hashCode() : 0);
    return result;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", " + this.getName() +
                " " + this.getQuota() +
                ", phone: " + this.getPrice() + "\n";
    }
}
