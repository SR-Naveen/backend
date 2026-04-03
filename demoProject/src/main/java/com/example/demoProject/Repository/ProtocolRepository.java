package com.example.demoProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoProject.Model.Protocol;

@Repository
// Inga String nu maathiyachu, yenna ID ippo String format-la irukku
public interface ProtocolRepository extends JpaRepository<Protocol, String> { 
}