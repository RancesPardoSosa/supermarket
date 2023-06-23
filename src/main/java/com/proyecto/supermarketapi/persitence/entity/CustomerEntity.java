package com.proyecto.supermarketapi.persitence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name = "id_customer" , nullable = false , length = 15)
    private String idCustomer;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(name = "last_name" , nullable = false , length = 50)
    private String lastName;

    @Column(name = "phone_number" , nullable = false , length = 50)
    private String phoneNumber;

    @Column(length = 100)
    private String address;

    @Column(nullable = false,unique = true , length = 50)
    private String email;

}
