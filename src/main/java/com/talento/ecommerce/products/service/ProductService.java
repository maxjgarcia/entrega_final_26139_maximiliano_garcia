package com.talento.ecommerce.products.service;

import com.talento.ecommerce.products.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> listProducts();
    Optional<Product> findProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);

}
