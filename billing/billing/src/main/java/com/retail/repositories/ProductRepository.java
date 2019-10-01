package com.retail.repositories;


import com.retail.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<ProductEntity,Long> {

}
