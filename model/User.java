//package model;

public class User {
    private String name;
    private Cart cart;

    public User(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}
