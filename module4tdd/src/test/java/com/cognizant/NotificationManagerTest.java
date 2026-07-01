package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NotificationManagerTest {

    @Test
    void testVoidMethod() {

        NotificationService mockService = mock(NotificationService.class);

        doNothing().when(mockService).sendNotification(anyString());

        NotificationManager manager = new NotificationManager(mockService);

        manager.notifyUser("Welcome");

        verify(mockService).sendNotification("Welcome");
    }
}