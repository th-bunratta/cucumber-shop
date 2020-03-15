package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        this.addProduct(name, price, 1);
    }
    public void addProduct(String name, double price, int quantity) {
        products.put(name, new Product(name, price, quantity));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
    // TODO: Check product inventory if the product is sufficient to order

    public boolean checkInventory(String productName) {
        Product p = products.get(productName);
        return p.getQuantity() > 0;
    }
}
