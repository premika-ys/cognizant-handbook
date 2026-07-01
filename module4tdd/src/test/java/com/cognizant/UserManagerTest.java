package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class UserManagerTest {

    @Test
    void testArgumentMatcher() {

        UserService mockService = mock(UserService.class);

        when(mockService.getUserName(anyString())).thenReturn("Premika");

        UserManager manager = new UserManager(mockService);

        assertEquals("Premika", manager.findUser("101"));

        verify(mockService).getUserName(anyString());
    }
}
