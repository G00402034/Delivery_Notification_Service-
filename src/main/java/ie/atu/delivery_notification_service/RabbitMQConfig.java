package ie.atu.delivery_notification_service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue orderStatusQueue() {
        return new Queue("order-status-queue", true);
    }

    @Bean
    public Queue paymentStatusQueue() {
        return new Queue("payment-status-queue", true);
    }

    @Bean
    public Queue deliveryStatusQueue() {
        return new Queue("delivery-status-queue", true);
    }

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
