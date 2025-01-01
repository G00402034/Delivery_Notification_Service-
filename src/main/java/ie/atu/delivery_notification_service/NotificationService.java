package ie.atu.delivery_notification_service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @RabbitListener(queues = "order-status-queue")
    public void processOrderStatusNotification(String message) {
        System.out.println("Mock Notification: " + message);
    }

    @RabbitListener(queues = "payment-status-queue")
    public void processPaymentStatusNotification(String message) {
        System.out.println("Mock Notification: " + message);
    }

    @RabbitListener(queues = "delivery-status-queue")
    public void processDeliveryStatusNotification(String message) {
        System.out.println("Mock Notification: " + message);
    }
}







