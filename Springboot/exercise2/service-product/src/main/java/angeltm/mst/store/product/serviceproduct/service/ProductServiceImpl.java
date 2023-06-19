package angeltm.mst.store.product.serviceproduct.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import angeltm.mst.store.product.serviceproduct.entity.Category;
import angeltm.mst.store.product.serviceproduct.entity.Product;
import angeltm.mst.store.product.serviceproduct.respository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        product.setStatus("CREATED");
        product.setCreateat(new Date());

        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productDB = getProduct(id);
        if (productDB == null) {
            return null;
        }
        productDB.setStatus("DELETED");
        return productRepository.save(productDB);
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> listAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDB = getProduct(product.getId());
        if (productDB == null) {
            return null;
        }
        productDB.setName(product.getName());
        productDB.setCategory(product.getCategory());
        productDB.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        return productRepository.save(productDB);
    }

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product productDB = getProduct(id);
        if (productDB == null) {
            return null;
        }
        Double stock = productDB.getStock()+quantity;
        productDB.setStock(stock);
        return productRepository.save(productDB);
    }
    
}
