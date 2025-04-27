package com.c0d3engr.ecommerce.repository;

import com.c0d3engr.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Extra queries can be added here later if needed
}
