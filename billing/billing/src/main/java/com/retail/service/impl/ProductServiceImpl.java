package com.retail.service.impl;

import com.retail.beans.Product;
import com.retail.entities.ProductEntity;
import com.retail.repositories.ProductRepository;
import com.retail.utils.ServiceUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void add(Product product) {
        productRepository.save(ServiceUtil.copyProperties(product));
    }

    @Override
    public void update(Product product) {
        productRepository.save(ServiceUtil.copyProperties(product));
    }

    @Override
    public void deleteById(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public Product findById(Long productId) {
        return ServiceUtil.copyProperties(productRepository.findById(productId).get());
    }

    @Override
    public List<Product> findAll() {
        List<ProductEntity> productEntities = new ArrayList<>();
        productRepository.findAll().forEach(productEntities :: add);
        return ServiceUtil.copyProperties(productEntities);
    }
}
