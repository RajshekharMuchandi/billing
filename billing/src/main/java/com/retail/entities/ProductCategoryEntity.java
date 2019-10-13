package com.retail.entities;

import javax.persistence.*;

@Entity
@Table(name = "PRDCT_CTGRY")
public class ProductCategoryEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "CTGRY_ID")
     private Long categoryId;

     @Column(name = "CTGRY_DESC")
     private String categoryDescription;

     public Long getCategoryId() {
          return categoryId;
     }

     public void setCategoryId(Long categoryId) {
          this.categoryId = categoryId;
     }

     public String getCategoryDescription() {
          return categoryDescription;
     }

     public void setCategoryDescription(String categoryDescription) {
          this.categoryDescription = categoryDescription;
     }
}