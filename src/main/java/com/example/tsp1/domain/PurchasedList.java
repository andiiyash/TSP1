package com.example.tsp1.domain;

import com.example.tsp1.domain.Client;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Setter
@NoArgsConstructor
@Table(name = "purchased list", schema = "db_ksp", catalog = "")
public class PurchasedList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "cost", nullable = false)
    private Integer cost;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = false)
    private Client client;


}
