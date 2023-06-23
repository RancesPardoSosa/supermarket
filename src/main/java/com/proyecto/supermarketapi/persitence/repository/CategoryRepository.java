package com.proyecto.supermarketapi.persitence.repository;

import com.proyecto.supermarketapi.persitence.entity.CategoryEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepository extends ListCrudRepository<CategoryEntity , Integer> {

}
