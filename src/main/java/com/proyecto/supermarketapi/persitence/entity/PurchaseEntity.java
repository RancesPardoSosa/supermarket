package com.proyecto.supermarketapi.persitence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "purchase")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_purchase" , nullable = false)
    private Integer idPurchase;

    @Column(name = "id_customer" , nullable = false , length = 15)
    private String idCustomer;

    @Column(nullable = false , columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(nullable = false , columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(nullable = false , columnDefinition = "CHAR(1)")
    private Character method;

    @Column(name = "additional_notes" , length = 200)
    private String additionalNotes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer" , referencedColumnName = "id_customer" , insertable = false , updatable = false)
    @JsonIgnore
    private CustomerEntity customerEntity;

    @OneToMany(mappedBy = "detail" , fetch = FetchType.EAGER)
    private List<PurchaseDetailEntity> details;
}
