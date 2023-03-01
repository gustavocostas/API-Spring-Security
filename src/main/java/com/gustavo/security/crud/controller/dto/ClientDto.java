package com.gustavo.security.crud.controller.dto;

import com.gustavo.security.crud.model.Client;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Builder
@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientDto {
    private Long id;
    private String username;
    private String password;
    private String email;

    public ClientDto(Client client) {
        this.id = client.getId();
        this.username = client.getUsername();
        this.password = client.getPassword();
        this.email = client.getEmail();
    }
}
