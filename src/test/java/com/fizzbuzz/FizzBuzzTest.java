package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test
    public void test_fizzbuzz_assign_value_number() {
        FizzBuzz mifizzBuzz = new FizzBuzz(5);
        mifizzBuzz.setNumber(6);
        assertEquals(6, mifizzBuzz.getNumber());
    }

    @Test
    public void test_fizzbuzz_return_fizz_divisible_3() {
        FizzBuzz mifizzBuzz = new FizzBuzz(9);
        assertEquals("fizz", mifizzBuzz.fizz());
    }

    @Test
    public void test_fizzbuzz_return_buzz_divisible_5() {
        FizzBuzz mifizzBuzz = new FizzBuzz(5);
        assertEquals("buzz", mifizzBuzz.buzz());
    }
}
