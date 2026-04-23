//package data;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public static List<Product> getProducts() {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Laptop", 300000));
        list.add(new Product(2, "Phone", 150000));
        list.add(new Product(3, "Headphones", 20000));
        list.add(new Product(4, "Mouse", 10000));

        return list;
    }
}
