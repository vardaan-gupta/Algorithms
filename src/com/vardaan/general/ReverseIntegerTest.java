package com.vardaan.general;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest
{

    @Test
    void when_input_0_then_return_0()
    {
        org.junit.Assert.assertEquals(0, ReverseInteger.reverseInteger(0));
       assertEquals(0, ReverseInteger.reverseInteger(0));
       
    }
    
    @Test
    void when_input_negative_expect_negative() {
        assertEquals(-54321, ReverseInteger.reverseInteger(-12345));
         
    }
    
    @Test
    void when_input_positive_expect_reverse_positive() {
        assertEquals(54321, ReverseInteger.reverseInteger(12345));
         
    }
    
    @Test
    void when_input_positive_single_number_expect_reverse_positive_single_number() {
        assertEquals(54321, ReverseInteger.reverseInteger(12345));
         
    }
    

}
