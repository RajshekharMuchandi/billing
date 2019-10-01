package com.retail.utils;

import com.retail.beans.Product;
import com.retail.entities.ProductCategoryEntity;
import com.retail.entities.ProductEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ServiceUtil {

    public static ProductEntity copyProperties(Product product){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(product.getProductId());
        productEntity.setProductName(product.getProductName());
        productEntity.setProductDescription(product.getProductDescription());
        productEntity.setCategoryId(product.getCategoryId());
        productEntity.setProductHsn(product.getProductHsn());
        productEntity.setProductPrice(new BigDecimal(product.getProductPrice()));
        return productEntity;
    }

    public static Product copyProperties(ProductEntity productEntity){
        Product product = new Product();
        product.setProductId(productEntity.getProductId());
        product.setProductName(productEntity.getProductName());
        product.setProductDescription(productEntity.getProductDescription());
        product.setCategoryId(String.valueOf(productEntity.getCategoryId()));
        product.setCategoryDescription(productEntity.getCategoryId());
        product.setProductHsn(productEntity.getProductHsn());
        product.setProductPrice(productEntity.getProductPrice().toString());
        return product;
    }

    public static List<Product> copyProperties(List<ProductEntity> productEntities){
        List<Product> products = new ArrayList<>();
        productEntities.forEach(product -> {products.add(copyProperties(product));});
        return products;
    }
}
