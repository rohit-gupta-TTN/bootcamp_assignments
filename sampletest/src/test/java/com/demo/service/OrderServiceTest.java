package com.demo.service;

import com.demo.domain.Order;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderServiceTest {

    static OrderService orderService;
    static Order order1;

    @BeforeClass
    public static void setup() {
        //Order class object
        order1 = new Order(10, "Pizza", 100);

        //OrderService Object using constructor
        orderService = new OrderService();
    }

    @Test
    public void testGetInstance_FirstTimeNotNull() {
        //getInstance() must not return Null
        assertNotNull(OrderService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingTwoGetInstances() {
        //any numbers of getInstance() invokes may not change the instance object
        OrderService getInstanceOrderService = OrderService.getInstance();
        assertEquals(getInstanceOrderService, OrderService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingGetInstanceWithNewOrderServiceObject() {
        //getInstance() and OrderService objects created using constructors must be different
        assertNotEquals(OrderService.getInstance(), orderService);
    }

    @Test
    public void testBooleanPlaceOrder_ReturnTrue() {
        //Checking the returned value of isNotified from sendEmail(Order o, String CC)
        assertTrue(orderService.placeOrder(order1, "Thanks for the order"));
    }

    @Test
    public void testBooleanPlaceOrder_CheckingUpdateInPriceWithTax() {
        //Checking the updated value of priceWithTax
        orderService.placeOrder(order1, "Thanks for the order");
        assertNotEquals(0, order1.getPriceWithTax());
    }

    @Test
    public void testBooleanPlaceOrder_CheckIsCustomerNotified() {
        //Checking the updated value of isCustomerNotified
        orderService.placeOrder(order1, "Thanks for the order");
        assertTrue(order1.isCustomerNotified());
    }

    @Test(expected= RuntimeException.class)
    public void testVoidPlaceOrder_ThrowsRuntimeException() {
        //void PlaceOrder(Order o) throws runtime exception due to the emailService.sendEmail(order);
        orderService.placeOrder(order1);
    }

}