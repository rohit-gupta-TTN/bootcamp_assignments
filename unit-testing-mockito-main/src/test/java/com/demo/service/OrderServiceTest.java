package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Spy
    Order order;

    @Mock
    EmailService emailService;

    @InjectMocks
    OrderService orderService;

    @Before
    public void setup() {
        order=spy(new Order(10, "Pizza", 100));
    }

    @Test
    public void testGetInstance_FirstTimeNotNull() {
        //getInstance() must not return Null
        assertNotNull(OrderService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingTwoGetInstances() {
        //any numbers of getInstance() invokes may not change the instance object
        assertSame(OrderService.getInstance(), OrderService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingGetInstanceWithNewOrderServiceObject() {
        //getInstance() and OrderService objects created using constructors must be different
        assertNotSame(OrderService.getInstance(), orderService);
    }

    @Test
    public void testBooleanPlaceOrder_ReturnTrue() {
        //Checking the returned value of isNotified from sendEmail(Order o, String CC)
        when(emailService.sendEmail(any(Order.class),any(String.class))).thenReturn(true);
        assertTrue(orderService.placeOrder(order, "Thanks for the order"));
    }

    @Test
    public void testBooleanPlaceOrder_ReturnFalse() {
        //Checking the returned value of isNotified from sendEmail(Order o, String CC)
        when(emailService.sendEmail(any(Order.class),any(String.class))).thenReturn(false);
        assertFalse(orderService.placeOrder(order, "Thanks for the order"));
    }

    @Test
    public void testBooleanPlaceOrder_CheckingUpdateInPriceWithTax() {
        //Checking the updated value of priceWithTax
        orderService.placeOrder(order, "Thanks for the order");
        assertNotEquals(0, order.getPriceWithTax());
    }

    @Test
    public void testBooleanPlaceOrder_CheckIsCustomerNotified() {
        //Checking the updated value of isCustomerNotified
        when(emailService.sendEmail(any(Order.class),any(String.class))).thenReturn(true);
        orderService.placeOrder(order, "Thanks for the order");
        verify(order, times(1)).setCustomerNotified(true);
    }

    @Test(expected = RuntimeException.class)
    public void testVoidPlaceOrder_ThrowsRuntimeException() {
        //void PlaceOrder(Order o) throws runtime exception due to the emailService.sendEmail(order);
        doThrow(new RuntimeException("An Exception Occurred")).when(emailService).sendEmail(any(Order.class));
        orderService.placeOrder(order);
    }
}