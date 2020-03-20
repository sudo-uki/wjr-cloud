package com.auth.properties;

import lombok.Data;

@Data
public class WjrClientsProperties {

    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";
}