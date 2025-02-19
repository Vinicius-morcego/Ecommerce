package br.vinicius.ecommerce.checkout.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;
}
