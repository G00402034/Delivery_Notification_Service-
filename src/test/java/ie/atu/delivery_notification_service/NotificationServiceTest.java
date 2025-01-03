package ie.atu.delivery_notification_service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class NotificationServiceTest {

    @InjectMocks
    private NotificationService notificationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testProcessOrderStatusNotification() {
        // Arrange
        OrderStatusMessage message = new OrderStatusMessage();
        message.setOrderId("12345");
        message.setCustomerId("54321");
        message.setRestaurantId("98765");
        message.setStatus("Delivered");
        message.setTotalAmount(100.50);
        message.setDeliveryAddress("123 Main St");
        message.setCreatedAt("2025-01-02T10:00:00");
        message.setUpdatedAt("2025-01-02T12:00:00");

        // Act & Assert
        assertDoesNotThrow(() -> notificationService.processOrderStatusNotification(message));
    }

    @Test
    void testProcessPaymentStatusNotification() {
        // Arrange
        String paymentMessage = "Payment for Order 12345 is Successful";

        // Act & Assert
        assertDoesNotThrow(() -> notificationService.processPaymentStatusNotification(paymentMessage));
    }

    @Test
    void testProcessDeliveryStatusNotification() {
        // Arrange
        String deliveryMessage = "Delivery for Order 12345 is In Transit";

        // Act & Assert
        assertDoesNotThrow(() -> notificationService.processDeliveryStatusNotification(deliveryMessage));
    }
}
