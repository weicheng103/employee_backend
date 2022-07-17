package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
