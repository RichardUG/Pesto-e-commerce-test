package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.model.Product;
import com.pesto.ecommerce.persistence.ProductPersistence;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductImpl implements ProductPersistence {

    private Map<Long, Product> products = new HashMap<>();
    private long idCounter = 0;

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductById(Long id) {
        return products.get(id);
    }

    @Override
    public void addProduct(Product product) {
        product.setId(++idCounter);
        products.put(product.getId(), product);
    }

    @Override
    public void updateProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(Long id) {
        products.remove(id);
    }
}