package com.example.tsp1.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @OneToMany(mappedBy = "film")
    private Collection<ClientHasFilm> clientHasFilms;

    @ManyToOne
    @JoinColumn(name = "producer_id", referencedColumnName = "id", nullable = false)
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "genre_id", referencedColumnName = "id", nullable = false)
    private Genre genre;

    @OneToMany(mappedBy = "film")
    private Collection<Review> reviews;


}
