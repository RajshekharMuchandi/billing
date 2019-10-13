package com.retail.repositories;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.retail.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends CrudRepository<ProductEntity,Long> {

    @Modifying
    @Query("update ProductEntity p set p.productName = ?1 where p.productId = ?2")
    int update(String productName, Long productId);
}
