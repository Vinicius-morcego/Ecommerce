package br.vinicius.ecommerce.checkout.config;

import br.vinicius.ecommerce.checkout.streaming.CheckoutCreatedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class
})
public class StreamingConfig {

   /* @StreamListener(Sink.INPUT)
    public void receberMensagem(String mensagem) {
        System.out.println("Recebida mensagem: " + mensagem);
    }

    @Bean
    public KafkaProperties kafkaProperties() {
        KafkaProperties kafkaProperties = new KafkaProperties();
        kafkaProperties.setBootstrapServers(Collections.singletonList("localhost:9092"));
        kafkaProperties.setClientId("meu-cliente");
        return kafkaProperties;
    }

    @Bean
    public BinderProperties binderProperties() {
        BinderProperties binderProperties = new BinderProperties();
        binderProperties.setDefaultCandidate(true);
        return binderProperties;
    }*/
}
