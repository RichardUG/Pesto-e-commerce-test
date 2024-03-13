package com.pesto.ecommerce.service;

import com.pesto.ecommerce.model.Product;
import com.pesto.ecommerce.persistence.ProductPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductPersistence productPersistence;

    public List<Product> getAllProducts() {
        return productPersistence.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productPersistence.getProductById(id);
    }

    public void addProduct(Product product) {
        productPersistence.addProduct(product);
    }

    public void updateProduct(Product product) {
        productPersistence.updateProduct(product);
    }

    public void deleteProduct(Long id) {
        productPersistence.deleteProduct(id);
    }
}
