package com.angeltm.store.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angeltm.store.Models.Product;
import com.angeltm.store.services.ProductService;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productservice;

    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> products = productservice.getProducts();
        ResponseEntity<List<Product>> response = new ResponseEntity<>(products,HttpStatus.OK);
        return response;
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable Long id){
        return productservice.getProductByid(id);
    }

    @PostMapping
    public Product insertProduct(@RequestBody Product product){
        return productservice.insertProduct(product);
    }

    @PutMapping()
    public Product modifyProduct(@RequestBody Product product){
        return productservice.update(product);
    }
    


}

