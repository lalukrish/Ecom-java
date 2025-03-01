package com.example.Ecom.controller;


import com.example.Ecom.model.Product;
import com.example.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @CrossOrigin
    @RequestMapping("/api")
    public class ProductController {


    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return  "Hello World";
    }
    @GetMapping("/get-all-products")
        public List<Product> getAllProducts(){
        return  service.getAllProducts();
    }

}
