package com.akhadam.kitabi.repository;

import com.akhadam.kitabi.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    CategoryEntity findByName(String name);

    CategoryEntity findByReference(String reference);
}
