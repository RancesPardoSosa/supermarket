package com.proyecto.supermarketapi.web.controller;

import com.proyecto.supermarketapi.persitence.entity.CategoryEntity;
import com.proyecto.supermarketapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryEntity>> getAll(){
        return ResponseEntity.ok(this.categoryService.getAll());
    }

    @GetMapping("/{idCategory}")
    public ResponseEntity<CategoryEntity> getById(@PathVariable Integer idCategory){
        if (this.categoryService.exist(idCategory)){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.categoryService.getById(idCategory));
    }

    @PostMapping
    public ResponseEntity<CategoryEntity> addCategory(@RequestBody CategoryEntity categoryEntity){
        if (this.categoryService.exist(categoryEntity.getIdCategory())){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.categoryService.addCategory(categoryEntity));
    }


}
