package com.example.tsp1.domain;

import com.example.tsp1.domain.Client;
import com.example.tsp1.domain.Film;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "client has film", schema = "db_ksp", catalog = "")
public class ClientHasFilm {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id", nullable = false)
    private Film film;


}
