package com.example.thymeleafDeneme.service;

import com.example.thymeleafDeneme.model.Product;

import java.util.List;

public interface ProductService {

    void deleteProduct(Long id);
    Product saveProduct(Product product);
    List<Product> listProduct();
}
