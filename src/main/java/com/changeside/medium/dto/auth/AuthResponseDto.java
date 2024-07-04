package com.changeside.medium.dto.auth;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String token_type="Bearer";

    public AuthResponseDto(String accessToken) {
        this.accessToken = accessToken;
    }
}
