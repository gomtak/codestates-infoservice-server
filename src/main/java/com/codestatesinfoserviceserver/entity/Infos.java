package com.codestatesinfoserviceserver.entity;

public class Infos {

    private String name;

    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Chats(String name, String message) {
        this.name = name;
        this.message = message;
    }
}