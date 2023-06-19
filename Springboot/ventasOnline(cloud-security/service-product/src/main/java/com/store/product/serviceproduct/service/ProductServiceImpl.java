package com.store.product.serviceproduct.service;

import java.util.Date;
import java.util.List;

import com.store.product.serviceproduct.entity.Category;
import com.store.product.serviceproduct.entity.Product;
import com.store.product.serviceproduct.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAllProduct() {
        return productRepository.findAll(); 
    }

    @Override
    public Product getProduct(Long id) {
       return productRepository.findById(id).get();
    }

    @Override
    public Product createProduct(Product product) {
       product.setStatus("CREATED");
       product.setCreateAt(new Date());
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productdb = getProduct(product.getId());
        if (null == productdb) {
            return null;
        }
        productdb.setName(product.getName());
        productdb.setDescription(product.getDescription());
        productdb.setCategory(product.getCategory());
        productdb.setPrice(product.getPrice());
        return productRepository.save(productdb);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productdb = getProduct(id);
        if (null == productdb) {
            return null;
        }
        productdb.setStatus("DELETED");
        return productRepository.save(productdb);
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product productdb = getProduct(id);
        if (null == productdb) {
            return null;
        }
        Double stock = productdb.getStock() +quantity;
        productdb.setStock(stock);
        return productRepository.save(productdb);
    }
    
}
