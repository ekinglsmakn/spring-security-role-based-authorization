package com.example.thymeleafDeneme.serviceImp;

import com.example.thymeleafDeneme.model.Product;
import com.example.thymeleafDeneme.repo.ProductRepo;
import com.example.thymeleafDeneme.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> listProduct() {
        return productRepo.findAll();
    }
}
