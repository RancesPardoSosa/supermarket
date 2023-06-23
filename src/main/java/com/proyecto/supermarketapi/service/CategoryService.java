package com.proyecto.supermarketapi.service;

import com.proyecto.supermarketapi.persitence.entity.CategoryEntity;
import com.proyecto.supermarketapi.persitence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryEntity> getAll(){
        return this.categoryRepository.findAll();
    }

    public CategoryEntity getById(Integer idCategory){
        return this.categoryRepository.findById(idCategory)
                .orElse(null);
    }

    public CategoryEntity addCategory(CategoryEntity categoryEntity){
        return this.categoryRepository.save(categoryEntity);
    }

    public boolean exist(Integer idCategory){
        return this.categoryRepository.existsById(idCategory);
    }
}
