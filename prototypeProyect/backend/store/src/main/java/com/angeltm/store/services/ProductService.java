package com.angeltm.store.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.angeltm.store.Models.Product;
import com.angeltm.store.Utilities.Status;
import com.angeltm.store.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductByid(long id){
        return productRepository.findById(id);
    }

    public Product insertProduct(Product product){
        if (validProduct(product)) {
            return productRepository.save(product);
        }
        return null;
    }

    @Transactional
    public Product update(Product product) {
        Product updateResponse = productRepository.save(product);
        return updateResponse;
    }


    
    private boolean validProduct(Product product){
        if (product.getName()!=null && !product.getName().equals("") ) {
            return true;
        }else{
            return false;
        }
    }
}
