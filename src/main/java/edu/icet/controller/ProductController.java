package edu.icet.controller;

import edu.icet.entity.ProductEntity;
import edu.icet.model.Product;
import edu.icet.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    ProductServiceImpl service;

    ProductController(ProductServiceImpl service){
        this.service=service;
    }

    @PostMapping("/product/create")
    void createProduct(@RequestBody Product product){
        service.createProduct(product);
    }
    @GetMapping("/product/get")
    Iterable<ProductEntity> getProducts(){
        return service.getProducts();
    }
}
