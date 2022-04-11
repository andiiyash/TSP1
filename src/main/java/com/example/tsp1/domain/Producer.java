package com.example.tsp1.domain;

import com.example.tsp1.domain.Film;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Producer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "producer_name", nullable = false, length = 45)
    private String producerName;

    @OneToMany(mappedBy = "producer")
    private Collection<Film> films;


}
