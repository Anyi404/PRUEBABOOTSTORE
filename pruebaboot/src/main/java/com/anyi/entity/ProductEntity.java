package com.anyi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.UUID;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;           // Identificador único del producto

    @Column(nullable = false)
    private String name;       // Nombre del producto

    @Column(nullable = false)
    private String category;   // Categoría del producto (Ej. "Ropa", "Accesorios")

    @Column(nullable = false)
    private String size;       // Talla del producto (Ej. "S", "M", "L")

    @Column(nullable = false)
    private String material;   // Material del producto (Ej. "Algodón", "Poliéster")

    @Column(nullable = false)
    private double price;      // Precio del producto

    @Column(nullable = false)
    private int stock;         // Cantidad en stock

    // Constructor vacío requerido por JPA
    public ProductEntity() {}

    // Constructor con parámetros
    public ProductEntity(String name, String category, String size, String material, double price, int stock) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.size = size;
        this.material = material;
        this.price = price;
        this.stock = stock;
    }

    // Getters y Setters
    // ...
}
