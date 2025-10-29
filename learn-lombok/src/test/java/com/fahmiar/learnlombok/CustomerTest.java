package com.fahmiar.learnlombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = new Customer();

        // wow we are automatically having setter and getter using lombok!
        customer.setName("Fahmi");
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructorAllArgs() {
        var customer = new Customer("Fahmi");

        Assertions.assertEquals("Fahmi", customer.getName());
    }

    @Test
    void testCustomerNoArgs() {
        var customer = new Customer();

        Assertions.assertNull(customer.getName());
    }

}
