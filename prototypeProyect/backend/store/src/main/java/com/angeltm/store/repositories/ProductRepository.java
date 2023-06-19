package com.angeltm.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angeltm.store.Models.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
