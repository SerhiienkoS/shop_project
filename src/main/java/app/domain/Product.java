package app.domain;

import java.util.Objects;

public class Product {
    private final Long id;
    private Boolean isActive;
    private String name;
    private double price;

    public Product(Long id, double price, String name, Boolean isActive) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.isActive = isActive;
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

    public double getPrice() {
        return price;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(id, product.id) && Objects.equals(isActive, product.isActive) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", isActive=").append(isActive);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
