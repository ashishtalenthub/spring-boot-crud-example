package com.example.demo.service.Impl;

import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;


public class ProductServiceImplTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService productService;


    private MockMvc mockMvc;

    @Test
    public void saveProduct() {
    }

    @Test
    public void saveProducts() {
    }

    @Test
    public void getProducts() {
    }

    @Test
    public void getProductById() {
    }

    @Test
    public void getProductByName() {
    }

    @Test
    public void deleteProductById() {
    }

    @Test
    public void updateProduct() {
    }
}