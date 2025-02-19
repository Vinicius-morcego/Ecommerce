package br.vinicius.ecommerce.checkout.service;

import br.vinicius.ecommerce.checkout.entity.CheckoutEntity;
import br.vinicius.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
