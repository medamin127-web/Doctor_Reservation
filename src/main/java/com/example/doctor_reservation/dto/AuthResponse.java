package com.example.doctor_reservation.dto;

import lombok.Data;



@Data
public class AuthResponse {
    private String token;
    private String role;

    public AuthResponse(String token, String role) {
        this.token = token;
        this.role = role;
    }

    // Getter
}