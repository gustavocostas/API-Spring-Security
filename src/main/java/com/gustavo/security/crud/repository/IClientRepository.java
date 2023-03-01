package com.gustavo.security.crud.repository;

import java.util.List;
import java.util.Optional;

import com.gustavo.security.crud.model.Client;

public interface IClientRepository {
    Client saveClient(Client client);

    List<Client> listClient();

    Optional<Client> findByIdClient(Long id);

    void deleteByIdClient(Long id);
}
