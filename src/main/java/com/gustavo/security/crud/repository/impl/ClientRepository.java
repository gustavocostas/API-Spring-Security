package com.gustavo.security.crud.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.security.crud.model.Client;
import com.gustavo.security.crud.repository.IClientRepository;

@Repository
public class ClientRepository implements IClientRepository {
    private RepositorySpringData repositorySpringData;

    ClientRepository(final RepositorySpringData repositorySpringData) {
        this.repositorySpringData = repositorySpringData;
    }

    @Override
    public Client saveClient(Client client) {
        return repositorySpringData.save(client);
    }

    @Override
    public List<Client> listClient() {
        return repositorySpringData.findAll();
    }

    @Override
    public Optional<Client> findByIdClient(final Long id) {
        return repositorySpringData.findById(id);
    }

    @Override
    public void deleteByIdClient(Long id) {
        repositorySpringData.deleteById(id);
    }

    private interface RepositorySpringData extends JpaRepository<Client, Long> {
    }
}
