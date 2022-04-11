package com.example.tsp1.spring.repository;

import com.example.tsp1.domain.ClientHasFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientHasFilmRepository extends JpaRepository<ClientHasFilm,Long> {
}
