package com.fahmiar.learnlombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = Customer.createEmpty();

        // wow we are automatically having setter and getter using lombok!
        customer.setName("Fahmi");
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructorAllArgs() {
        var customer = Customer.create("Fahmi");

        Assertions.assertEquals("Fahmi", customer.getName());
    }

    @Test
    void testCustomerNoArgs() {
        var customer = Customer.createEmpty();

        Assertions.assertNull(customer.getName());
    }

    @Test
    void testCustomerToString() {
        var customer = Customer.create("fahmi");
        System.out.println(customer);
    }
}
