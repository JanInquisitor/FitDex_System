package org.example.data;

import org.example.product.Product;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    List<Product> productList;

    public DataSource(List<Product> productList) {
        this.productList = productList;
    }

    public DataSource() {
        this.productList = new ArrayList<>(); // Initialize the productList

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setId((long) (i + 1)); // Assuming IDs start from 1
            product.setName("Product" + (i + 1));
            product.setDescription("Description for Product" + (i + 1));
            product.setBrand("Brand" + (i + 1));
            product.setIngredients("Ingredient" + (i + 1));
            product.setLocation("Location" + (i + 1));
            product.setNutritionalInformation("Nutritional Info for Product" + (i + 1));
            product.setImageUrl("https://example.com/image" + (i + 1) + ".jpg");
            product.setPrice(random.nextDouble() * 100); // Random price between 0 and 100

            productList.add(product);
        }
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "productList=" + productList +
                '}';
    }
}
