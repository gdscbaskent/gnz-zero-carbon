package com.example.carbonfootprint.dto;

public class CompensatingDTO {
    private final String name;
    private final String amount;

    public CompensatingDTO(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }
}
