package com.demo.service;

import com.demo.domain.Order;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailServiceTest {

    static Order order;
    static EmailService emailService;
    static EmailService getInstanceEmailService;

    @BeforeClass
    public static void setup() {
        order = new Order(10, "Pizza", 78.9);
        emailService = new EmailService();
        getInstanceEmailService = EmailService.getInstance();
    }

    @Test
    public void testGetInstance_FirstTimeNotNull() {
        //getInstance() must not return Null
        assertNotNull(getInstanceEmailService);
    }

    @Test
    public void testGetInstance_ComparingTwoGetInstances() {
        //any numbers of getInstance() invokes may not change the instance object
        assertEquals(getInstanceEmailService, EmailService.getInstance());
    }

    @Test
    public void testGetInstance_ComparingGetInstanceWithNewEmailServiceObject() {
        //getInstance() and EmailService objects created using constructors must be different
        assertNotEquals(EmailService.getInstance(), emailService);
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
}