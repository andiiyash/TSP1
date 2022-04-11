package com.example.tsp1.spring.repository;


import com.example.tsp1.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlimRepository extends JpaRepository<Film,Long> {
}
