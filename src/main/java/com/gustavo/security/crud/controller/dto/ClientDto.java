package com.gustavo.security.crud.controller.dto;

import com.gustavo.security.crud.model.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private Long id;
    private String username;
    private String passwords;
    private String email;

    public ClientDto(Client client) {
        this.id = client.getId();
        this.username = client.getUsername();
        this.passwords = client.getPasswords();
        this.email = client.getEmail();
    }
}
