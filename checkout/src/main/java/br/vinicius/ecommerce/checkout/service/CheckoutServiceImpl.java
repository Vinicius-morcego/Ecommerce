package br.vinicius.ecommerce.checkout.service;

import br.vinicius.ecommerce.checkout.entity.CheckoutEntity;
import br.vinicius.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.vinicius.ecommerce.checkout.repository.CheckoutRepository;
import br.vinicius.ecommerce.checkout.resource.checkout.CheckoutRequest;
import br.vinicius.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);

        final CheckoutCreatedEvent event = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus())
                .build();
        checkoutCreatedSource.output().send(MessageBuilder.withPayload(event).build());
        return Optional.of(entity);
    }
}
