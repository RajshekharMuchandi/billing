package com.retail.controllers;

import com.retail.beans.Product;
import com.retail.request.ProductRequest;
import com.retail.service.impl.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/add")
    public  ResponseEntity<Void> createProduct(@RequestBody ProductRequest productRequest,
                                               UriComponentsBuilder uriComponentsBuilder){
        Product product = new Product();
        BeanUtils.copyProperties(productRequest,product);
        productService.add(product);
        UriComponents uriComponents = uriComponentsBuilder.path("/products/{id}").buildAndExpand(product.getProductId());
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @PostMapping("/update")
    public  ResponseEntity<Void> updateProduct(@RequestBody ProductRequest productRequest,
                                               UriComponentsBuilder uriComponentsBuilder){
        Product product = new Product();
        BeanUtils.copyProperties(productRequest,product);
        productService.update(product);
        UriComponents uriComponents = uriComponentsBuilder.path("/products/{id}").buildAndExpand(product.getProductId());
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable("productId") Long productId){
       return new ResponseEntity<Product>(productService.findById(productId), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Product> deleteProductById(@PathVariable("productId") Long productId){
        return new ResponseEntity<Product>(productService.findById(productId), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProducts(){
        productService.deleteAll();
        return new ResponseEntity(HttpStatus.OK);
    }


}
