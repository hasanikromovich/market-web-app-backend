package com.example.myfirstfullstackwebsite.repositories;

import com.example.myfirstfullstackwebsite.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByCategoryId(@Param("category_id") Long category);
    List<Product> findAllByOrderByIdAsc();

}
