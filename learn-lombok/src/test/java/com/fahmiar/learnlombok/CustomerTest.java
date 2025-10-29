package com.fahmiar.learnlombok;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = new Customer();

        // wow we are automatically having setter and getter using lombok!
        customer.setName("Fahmi");
        System.out.println(customer.getName());
    }

}
