package com.Pharmacy.Pharmacy.repositories;

import com.Pharmacy.Pharmacy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
