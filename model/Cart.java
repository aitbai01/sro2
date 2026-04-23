//package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Себет бос.");
            return;
        }

        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() +
                    " x" + item.getQuantity() +
                    " = " + item.getTotalPrice());
        }
    }

    public double getTotal() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getTotalPrice();
        }
        return sum;
    }
}