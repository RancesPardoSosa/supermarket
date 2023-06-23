package com.proyecto.supermarketapi.persitence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product" , nullable = false)
    private Integer idProduct;

    @Column(nullable = false , length = 100)
    private String name;

    @Column(name = "id_category" , nullable = false)
    private Integer idCategory;

    @Column(nullable = false , columnDefinition = "DECIMAL(6,2)")
    private Double price;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false , columnDefinition = "TINYINT")
    private Boolean available;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category" , referencedColumnName = "id_category" , insertable = false , updatable = false)
    @JsonIgnore
    private CategoryEntity categoryEntity;
}
