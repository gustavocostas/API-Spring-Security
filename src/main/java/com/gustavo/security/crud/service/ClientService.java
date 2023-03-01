package com.gustavo.security.crud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.gustavo.security.crud.controller.dto.ClientDto;
import com.gustavo.security.crud.exception.ClientNotFoundException;
import com.gustavo.security.crud.mapper.ClientMapper;
import com.gustavo.security.crud.model.Client;
import com.gustavo.security.crud.repository.IClientRepository;

@Service
public class ClientService {
    IClientRepository iClientRepository;

    public ClientService(IClientRepository iClientRepository) {
        this.iClientRepository = iClientRepository;
    }

    public ClientDto createClient(ClientDto clientDto) {
        return ClientMapper.toClientDto(iClientRepository.saveClient(ClientMapper.toClient(clientDto)));
    }

    public List<ClientDto> listClient() {
        return iClientRepository.listClient().stream().map(ClientMapper::toClientDto).toList();
    }

    public Stream<ClientDto> findClientByid(Long id) {
        return iClientRepository.findByIdClient(id).stream().map(ClientMapper::toClientDto);
    }

    public void deleteClientById(Long id) {
        Optional<Client> client = iClientRepository.findByIdClient(id);
        client.orElseThrow(
                () -> new ClientNotFoundException("Client not found"));
        iClientRepository.deleteByIdClient(id);
    }
}
