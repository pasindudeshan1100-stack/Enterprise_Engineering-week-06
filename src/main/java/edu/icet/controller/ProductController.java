package edu.icet.controller;

import edu.icet.model.Product;
import edu.icet.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    ProductServiceImpl service;

    ProductController(ProductServiceImpl service){
        this.service=service;
    }

    @PostMapping
    void createProduct(@RequestBody Product product){
        service.createProduct(product);
    }
    @GetMapping
    List<Product>getProducts(){
        return service.getProducts();
    }
}
