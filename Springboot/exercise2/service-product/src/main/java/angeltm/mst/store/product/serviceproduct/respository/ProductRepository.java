package angeltm.mst.store.product.serviceproduct.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import angeltm.mst.store.product.serviceproduct.entity.Category;
import angeltm.mst.store.product.serviceproduct.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Long>{
    public List<Product> findByCategory(Category category);
}
