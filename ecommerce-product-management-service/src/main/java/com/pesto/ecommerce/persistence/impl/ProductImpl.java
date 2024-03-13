package com.pesto.ecommerce.persistence.impl;

import com.pesto.ecommerce.model.Product;
import com.pesto.ecommerce.persistence.ProductPersistence;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.LockModeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductImpl implements ProductPersistence {

    private Map<Long, Product> products = new HashMap<>();
    private long idCounter = 0;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAllProducts() {
        try {
            return new ArrayList<>(products.values());
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Product getProductById(Long id) {
        try {
            return products.get(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        try {
            product.setId(++idCounter);
            products.put(product.getId(), product);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Transactional
    public void updateProduct(Product product) {
        try {
            products.put(product.getId(), product);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Transactional
    public void deleteProduct(Long id) {
        try {
            products.remove(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
