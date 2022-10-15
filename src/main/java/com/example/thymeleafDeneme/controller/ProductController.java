package com.example.thymeleafDeneme.controller;

import com.example.thymeleafDeneme.model.Product;
import com.example.thymeleafDeneme.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/new")
    public String showNewProductForm(Model model) {
        //creating mode attribute to bind form data
        Product product = new Product();
        model.addAttribute("product", product);
        List<Product> productList = productService.listProduct();
        model.addAttribute("productList", productList);
        return "product/newProduct";
    }

    @PostMapping("/saveproduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        this.productService.saveProduct(product);
        return "redirect:/listproduct";
    }

    @GetMapping("/listproduct")
    public String openProductPage(Model model){

        model.addAttribute("list",productService.listProduct());
        return "product/productPage";
    }

    @GetMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id, Model model){

        productService.deleteProduct(id);
        return "redirect:/listproduct";
    }

}
