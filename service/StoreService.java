import java.util.List;

public class StoreService {
    package service;

//import model.*;
import java.util.List;

    public class StoreService {

        public void showProducts(List<Product> products) {
            for (Product p : products) {
                System.out.println(p);
            }
        }

        public Product findProduct(List<Product> products, int id) {
            for (Product p : products) {
                if (p.getId() == id) return p;
            }
            return null;
        }
    }
}
