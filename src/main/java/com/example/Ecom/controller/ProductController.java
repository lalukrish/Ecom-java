package com.example.Ecom.controller;


import com.example.Ecom.model.Product;
import com.example.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        public ResponseEntity  <List<Product> >getAllProducts(){
        return new ResponseEntity<>( service.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("/get-product-By-id/{id}")
         public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product = service.getProductById(id);

        if(product !=null)
            return  new ResponseEntity<>(product, HttpStatus.OK);
        else
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

}
