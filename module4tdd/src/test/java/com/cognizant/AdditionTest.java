package com.cognizant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
    }
}
