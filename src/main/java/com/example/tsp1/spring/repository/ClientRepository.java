package com.example.tsp1.spring.repository;

import com.example.tsp1.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
