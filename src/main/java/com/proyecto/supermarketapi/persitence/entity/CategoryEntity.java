package com.proyecto.supermarketapi.persitence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category" , nullable = false)
    private Integer idCategory;

    @Column(nullable = false , length = 100)
    private String description;

    @Column(nullable = false , columnDefinition = "TINYINT")
    private Boolean available;
}
