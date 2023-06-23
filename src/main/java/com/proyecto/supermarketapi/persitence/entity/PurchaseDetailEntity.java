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
@IdClass(PurchaseDetailPK.class)
@Table(name = "purchase_detail")
public class PurchaseDetailEntity {
    @Id
    @Column(name = "id_purchase" , nullable = false)
    private Integer idPurchase;

    @Id
    @Column(name = "id_detail" , nullable = false)
    private Integer idDetail;

    @Column(name = "id_product" , nullable = false)
    private Integer idProduct;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false , columnDefinition = "DECIMAL(6,2)")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_purchase" , referencedColumnName = "id_purchase" , insertable = false , updatable = false)
    @JsonIgnore
    private PurchaseEntity detail;

    @OneToOne
    @JoinColumn(name = "id_product" , referencedColumnName = "id_product" , insertable = false , updatable = false)
    private ProductEntity productEntity;
}
