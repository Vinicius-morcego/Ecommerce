package br.vinicius.ecommerce.checkout.entity;


import jakarta.persistence.*;


import lombok.Builder;
import lombok.Data;


@Builder
@Data
@Entity
public class CheckoutEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String code;
}
