package com.pesto.ecommerce.persistence;

import com.pesto.ecommerce.model.Product;

import java.util.List;

public interface ProductPersistence {
    List<Product> getAllProducts();

    Product getProductById(Long id);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Long id);
}