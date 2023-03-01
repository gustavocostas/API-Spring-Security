package com.gustavo.security.crud.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.security.crud.controller.dto.ClientDto;
import com.gustavo.security.crud.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(clientDto));
    }

    @GetMapping
    public ResponseEntity<List<ClientDto>> listClient() {
        return ResponseEntity.ok(clientService.listClient());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stream<ClientDto>> findClientById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findClientByid(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteClientById(@PathVariable Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok(id);
    }
}
