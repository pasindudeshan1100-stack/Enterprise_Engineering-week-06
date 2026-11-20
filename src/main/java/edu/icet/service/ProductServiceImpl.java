package edu.icet.service;

import edu.icet.entity.ProductEntity;
import edu.icet.model.Product;
import edu.icet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductRepository repository;

    public  void createProduct(Product product){
        ProductEntity entity=new ProductEntity();
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        entity.setDescription(product.getDescription());
        entity.setActive(product.isActive());

        repository.save(entity);

    }
    public Iterable<ProductEntity>getProducts(){
        return repository.findAll();
    }
}
