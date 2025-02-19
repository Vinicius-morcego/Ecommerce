package br.vinicius.ecommerce.checkout.service;

import br.vinicius.ecommerce.checkout.entity.CheckoutEntity;
import br.vinicius.ecommerce.checkout.repository.CheckoutRepository;
import br.vinicius.ecommerce.checkout.resource.checkout.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
