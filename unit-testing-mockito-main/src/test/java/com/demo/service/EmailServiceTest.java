package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Mock
    Order order;

    @InjectMocks
    EmailService emailService;

    @Test
    public void testGetInstance_FirstTimeNotNull() {
        //getInstance() must not return Null
        assertNotNull(EmailService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingTwoGetInstances() {
        //any numbers of getInstance() invokes may not change the instance object
        assertSame(EmailService.getInstance(), EmailService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingGetInstanceWithNewEmailServiceObject() {
        //getInstance() and EmailService objects created using constructors must be different
        assertNotSame(EmailService.getInstance(), emailService);
    }

    //using JUnit 4
    @Test(expected = RuntimeException.class)
    public void testSendEmail_ThrowsRuntimeException() {
        //JUnit 4 doesn't have assertThrows
        //It throws runtime exception
        emailService.sendEmail(order);
    }

    @Test
    public void testSendEmailBoolean_ReturnTrue() {
        //Checking the returned value of sendEmail(Order o, String CC)
        assertTrue(emailService.sendEmail(order, "Thanks for the order"));
    }

    @Test
    public void testSendEmailBoolean_VerifySetCustomerNotifiedCalled_WithTrue() {
        //Checking order.setCustomerNotified(true) is called 1 time
        emailService.sendEmail(order, "Thanks for the order");
        verify(order, times(1)).setCustomerNotified(true);
    }

    @Test
    public void testSendEmailBoolean_VerifySetCustomerNotifiedIsNotCalled_WithFalse() {
        //Checking order.setCustomerNotified(true) is never called
        emailService.sendEmail(order, "Thanks for the order");
        verify(order, never()).setCustomerNotified(false);
    }
}