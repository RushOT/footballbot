package com.remnant.footnewz.model.Telegram;

public class Bot {

    private String id;
    private String token;
    private String name;

    public Bot(String token) {
        this.token = token;
    }

    public Bot(String id, String token, String name) {
        this.id = id;
        this.token = token;
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
