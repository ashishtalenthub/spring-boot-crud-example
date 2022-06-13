package com.example.demo.service.Impl;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public String deleteProductById(int id) {

        productRepository.deleteById(id);

        return "product vanished !!" + id;
    }

    @Override
    public Product updateProduct(Product product) {

        Product existingProduct = productRepository.findById(product.getId()).orElse(null);

        assert existingProduct != null;
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity((product.getQuantity()));

        return productRepository.save(existingProduct);
    }


}
