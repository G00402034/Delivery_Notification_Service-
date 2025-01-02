package ie.atu.delivery_notification_service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {




    @RabbitListener(queues = "order-status-queue")
    public void processOrderStatusNotification(OrderStatusMessage message) {
        System.out.println("Order Notification: " + message);
    }


    @RabbitListener(queues = "payment-status-queue")
        public void processPaymentStatusNotification(String message) {
            try {
                System.out.println("Mock Payment Notification: " + message);
            } catch (Exception e) {
                System.err.println("Error processing payment-status message: " + e.getMessage());
            }
        }

        @RabbitListener(queues = "delivery-status-queue")
        public void processDeliveryStatusNotification(String message) {
            try {
                System.out.println("Mock Delivery Notification: " + message);
            } catch (Exception e) {
                System.err.println("Error processing delivery-status message: " + e.getMessage());
            }
        }
    }









