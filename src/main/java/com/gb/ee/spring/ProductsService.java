package com.gb.ee.spring;

import com.gb.ee.spring.Product;
import com.gb.ee.spring.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    public Product saveOrUpdateProduct(Product product) {
        return productsRepository.saveOrUpdateProduct(product);
    }

    public Product findById(Long id) {
        return productsRepository.findById(id);
    }
}
