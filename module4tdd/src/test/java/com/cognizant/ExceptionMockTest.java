package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ExceptionMockTest {

    @Test
    void testMockException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenThrow(new RuntimeException("API Error"));

        assertThrows(RuntimeException.class, () -> {
            mockApi.getData();
        });
    }
}