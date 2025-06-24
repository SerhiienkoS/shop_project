package app.domain;

import jdk.internal.org.commonmark.internal.util.LinkScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// POJO - POJO (Plain Old Java Object) — это обычный Java-объект, который не зависит от каких-либо специфических фреймворков или интерфейсов. Он может содержать любое количество полей и методов, которые не обязательно должны быть приватными или публичными. POJO обычно используется для инкапсуляции бизнес-логики в приложениях
public class Customer {
    private final Long id;
    private Boolean isActive;
    private String name;
    private final List<Product> products = new ArrayList<>();

    public Customer(Long id, Boolean isActive, String name) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(isActive, customer.isActive) && Objects.equals(name, customer.name) && Objects.equals(products, customer.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, products);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("id=").append(id);
        sb.append(", isActive=").append(isActive);
        sb.append(", name='").append(name).append('\'');
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
