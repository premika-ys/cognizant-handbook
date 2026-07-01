package com.cognizant;

public class Client {

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void displayMessage() {
        System.out.println(messageService.getMessage());
    }

}