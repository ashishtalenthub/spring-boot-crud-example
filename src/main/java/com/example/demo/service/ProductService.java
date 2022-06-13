package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    List<Product> saveProducts(List<Product> products);

    List<Product> getProducts();

    Product getProductById(int id);

    Product getProductByName(String name);

    String deleteProductById(int id);

    Product updateProduct(Product product);


}
