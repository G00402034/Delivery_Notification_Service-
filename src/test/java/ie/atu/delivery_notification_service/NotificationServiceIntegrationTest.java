package ie.atu.delivery_notification_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@SpringBootTest
class NotificationServiceIntegrationTest {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void testProcessOrderStatusNotification() {

        OrderStatusMessage message = new OrderStatusMessage();
        message.setOrderId("testOrderId");
        message.setCustomerId("testCustomerId");
        message.setStatus("Processing");


        rabbitTemplate.convertAndSend("order-status-queue", message);


        System.out.println("Message sent to RabbitMQ for testing.");
    }
}
