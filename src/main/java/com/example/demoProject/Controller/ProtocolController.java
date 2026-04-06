package com.example.demoProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoProject.Model.Protocol;
import com.example.demoProject.Repository.ProtocolRepository;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "*") 
public class ProtocolController {

    @Autowired
    private ProtocolRepository repository;

    @GetMapping
    public ResponseEntity<List<Protocol>> getAllProtocols() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Protocol> createProtocol(@RequestBody Protocol protocol) {
        System.out.println("Saving new protocol: " + protocol.getProtocolName());
        Protocol savedProtocol = repository.save(protocol);
        return ResponseEntity.ok(savedProtocol);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProtocol(@PathVariable String id) { 
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}