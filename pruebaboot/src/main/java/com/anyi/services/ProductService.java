package com.anyi.services;

import com.anyi.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private final List<ProductEntity> products;

    // Constructor
    public ProductService() {
        products = new ArrayList<>();
        // Inicializando algunos productos de ejemplo
        products.add(new ProductEntity("Sweater", "Ropa", "M", "Algodón", 25.00, 20));
        products.add(new ProductEntity("Chaqueta impermeable", "Ropa", "L", "Poliéster", 40.00, 10));
        products.add(new ProductEntity("Collar elegante", "Accesorios", "M", "Cuero", 15.00, 30));
    }

    // Métodos CRUD
    // ...
}
