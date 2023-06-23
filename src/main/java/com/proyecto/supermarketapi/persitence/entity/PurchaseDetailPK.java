package com.proyecto.supermarketapi.persitence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDetailPK implements Serializable {
    private Integer idPurchase;
    private Integer idDetail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseDetailPK that)) return false;
        return Objects.equals(idPurchase, that.idPurchase) && Objects.equals(idDetail, that.idDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPurchase, idDetail);
    }
}
