package br.vinicius.ecommerce.checkout.resource.checkout;

import lombok.*;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutResponse implements Serializable {

    private String code;
}
