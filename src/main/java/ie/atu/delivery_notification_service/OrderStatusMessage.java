package ie.atu.delivery_notification_service;

import lombok.Data;

@Data
public class OrderStatusMessage {

    private String orderId;
    private String deliveryPersonName;
    private String customerEmail;
    private String customerPhoneNumber;
    private String status;
    private String message;
}
