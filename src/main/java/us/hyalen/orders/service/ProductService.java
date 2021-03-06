package us.hyalen.orders.service;

import us.hyalen.orders.domain.Product;
import us.hyalen.orders.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(String productId) {
        return productRepository.findOne(productId);
    }
}
