package com.ontariotechu.sofe3980U;

public class APIResult {

    private String name;
    private String suggestedEmail;

    public APIResult(String name, String suggestedEmail) {
        this.name = name;
        this.suggestedEmail = suggestedEmail;
    }

    public String getName() {
        return name;
    }

    public String getSuggestedEmail() {
        return suggestedEmail;
    }
}