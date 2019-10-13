package com.retail.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRDCTS")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRDCT_ID")
    private Long productId;

    @Column(name = "PRDCT_NM")
    private String productName;

    @Column(name = "PRDCT_DESC")
    private String productDescription;

    @Column(name = "CTGRY_ID")
    private String categoryId;

    @Column(name = "PRDCT_HSN")
    private String productHsn;

    @Column(name = "PRDCT_PRCE")
    private BigDecimal productPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductHsn() {
        return productHsn;
    }

    public void setProductHsn(String productHsn) {
        this.productHsn = productHsn;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}