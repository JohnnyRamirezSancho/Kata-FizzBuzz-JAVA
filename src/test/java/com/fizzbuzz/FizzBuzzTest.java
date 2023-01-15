package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void test_fizzbuzz_assign_value_number() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(6);
        assertEquals(6, mifizzBuzz.getNumber());
    }
    @Test
    public void test_fizzbuzz_return_fizz_divisible_3() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(6);
        assertEquals("fizz", mifizzBuzz.fizzBuzz());
    }
    @Test
    public void test_fizzbuzz_return_buzz_divisible_5() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(10);
        assertEquals("buzz", mifizzBuzz.fizzBuzz());
    }
    @Test
    public void test_fizzbuzz_return_fizzbuzz_divisible_3_and_5() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(60);
        assertEquals("fizzbuzz", mifizzBuzz.fizzBuzz());
    }


    @Test
    public void test_fizzbuzz_return_fizz_divisible_or_content_3() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(13);
        assertEquals("fizz", mifizzBuzz.fizzBuzzTwo());
    }
    @Test
    public void test_fizzbuzz_return_buzz_divisible_or_content_5() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(52);
        assertEquals("buzz", mifizzBuzz.fizzBuzzTwo());
    }
    @Test
    public void test_fizzbuzz_return_fizzbuzz_divisible_or_content_3_and_5() {
        FizzBuzz mifizzBuzz = new FizzBuzz();
        mifizzBuzz.setNumber(51);
        assertEquals("fizzbuzz", mifizzBuzz.fizzBuzzTwo());
    }
}
