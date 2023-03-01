package com.gustavo.security.crud.mapper;

import org.modelmapper.ModelMapper;

import com.gustavo.security.crud.controller.dto.ClientDto;
import com.gustavo.security.crud.model.Client;

public class ClientMapper {
    public static Client toClient(ClientDto clientDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(clientDto, Client.class);
    }

    public static ClientDto toClientDto(Client client) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(client, ClientDto.class);
    }
}
