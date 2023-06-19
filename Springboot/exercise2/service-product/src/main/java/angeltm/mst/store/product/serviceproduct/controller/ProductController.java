package angeltm.mst.store.product.serviceproduct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import angeltm.mst.store.product.serviceproduct.entity.Category;
import angeltm.mst.store.product.serviceproduct.entity.Product;
import angeltm.mst.store.product.serviceproduct.service.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>>listProduct(@RequestParam(name = "categoryId",required = false) Long categoryId){
        List<Product> products = new ArrayList<>();
        if (categoryId == null) {
            products = productService.listAllProduct();

        }else{
            products = productService.findByCategory(Category.builder().id(categoryId).build());
        }
        
        if (products.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product>getProduct(@PathVariable(name = "id") Long productId){


        Product product = productService.getProduct(productId);
        
        
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product>insertProduct(@RequestBody Product product){
        
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Product>updateProduct(@PathVariable(name = "id") Long id,@RequestBody Product product){
        product.setId(id);    
        Product productoDb = productService.updateProduct(product);
        if (productoDb==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Product>deleteProduct(@PathVariable(name = "id") Long id){ 
        Product deletedProduct = productService.deleteProduct(id);
        if (deletedProduct==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedProduct);
    }

    @GetMapping(value = "/{id}/stock")
    public ResponseEntity<Product>updateStockProduct(@PathVariable(name = "id") Long id,@RequestParam(value = "quantity",required = true) Double stock){
        
        Product productUpdated = productService.updateStock(id,stock);
        if (productUpdated==null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productUpdated);
    }
}

