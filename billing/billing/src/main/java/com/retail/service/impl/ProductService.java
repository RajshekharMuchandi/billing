package com.retail.service.impl;

import com.retail.beans.Product;

import java.util.List;

public interface ProductService {

    public void add(Product product);

    public void update(Product product);

    public void deleteById(Long productId);

    public void deleteAll();

    public Product findById(Long productId);

    public List<Product> findAll();
}
