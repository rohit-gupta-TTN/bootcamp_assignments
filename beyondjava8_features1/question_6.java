//Q.6 You are tasked with writing a processOrderStatus method that takes an OrderStatus enum as input and returns a descriptive string based on the order status.
//Here's the OrderStatus enum:
//
//public enum OrderStatus {
//    PENDING,
//    PROCESSING,
//    SHIPPED,
//    DELIVERED,
//    CANCELLED,
//    REFUNDED
//}
//Your processOrderStatus method should adhere to the following rules:
//
//For PENDING orders, return: "Order is awaiting confirmation."
//For PROCESSING orders, return: "Order is being prepared."
//For SHIPPED orders, return: "Order has been dispatched."
//For DELIVERED orders, return: "Order has been successfully delivered."
//For CANCELLED orders, return: "Order has been canceled."
//For REFUNDED orders, return: "Refund has been issued for the order."
//Use a single switch expression to achieve this.
//
//Enhancements:
//
//yield Keyword: If your logic requires more complex processing within a case, demonstrate the use of the yield keyword to return a value from the switch expression.

package beyondjava8_features2;

import java.util.Scanner;

public class question_6 {
    public enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        DELIVERED,
        CANCELLED,
        REFUNDED
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the status of your order");
        String status= scn.nextLine().trim().toUpperCase();
        OrderStatus orderStatus = OrderStatus.valueOf(status);
        System.out.println(processOrderStatus(orderStatus));

    }
    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> "Order has been canceled.";
            case REFUNDED -> {
                // writing logic to refund
                int  refund = 100;
                // did this to write yield
                yield "Refund has been issued for the order.";
            }
        };
    }
}
