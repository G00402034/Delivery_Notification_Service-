package ie.atu.delivery_notification_service;

import lombok.Data;

import java.util.List;

@Data
public class OrderStatusMessage {
    private String orderId;
    private String customerId;
    private String restaurantId;
    private List<String> items;
    private double totalAmount;
    private String deliveryAddress;
    private String status;
    private String createdAt;
    private String updatedAt;
}
