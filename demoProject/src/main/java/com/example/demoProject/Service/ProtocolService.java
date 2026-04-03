package com.example.demoProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoProject.Model.Protocol;
import com.example.demoProject.Repository.ProtocolRepository;

@Service
public class ProtocolService {

    private final ProtocolRepository repository;

    public ProtocolService(ProtocolRepository repository) {
        this.repository = repository;
    }

    public Protocol create(Protocol protocol) {
        return repository.save(protocol);
    }

    public List<Protocol> getAll() {
        return repository.findAll();
    }

    // UPDATE: Long id -> String id nu maathiyachu
    public Protocol getById(String id) {
        return repository.findById(id).orElseThrow();
    }

    // UPDATE: Long id -> String id nu maathiyachu
    public Protocol update(String id, Protocol updated) {
        Protocol existing = getById(id);

        existing.setProtocolName(updated.getProtocolName());
        existing.setExecutionDate(updated.getExecutionDate());
        existing.setExecutionTime(updated.getExecutionTime());
        existing.setRecurrence(updated.getRecurrence());
        existing.setCategory(updated.getCategory());
        existing.setPriority(updated.getPriority());
        existing.setChannel(updated.getChannel());

        return repository.save(existing);
    }

    // UPDATE: Long id -> String id nu maathiyachu
    public void delete(String id) {
        repository.deleteById(id);
    }
}