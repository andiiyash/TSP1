package com.example.tsp1.domain;

import com.example.tsp1.domain.ClientHasFilm;
import com.example.tsp1.domain.PurchasedList;
import com.example.tsp1.domain.Review;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "login", nullable = false, length = 45)
    private String login;

    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "bank_card", nullable = false, length = 16)
    private String bankCard;

    @OneToMany(mappedBy = "client")
    private List<ClientHasFilm> clientHasFilms;

    @OneToMany(mappedBy = "client")
    private List<PurchasedList> purchasedLists;

    @OneToMany(mappedBy = "client")
    private List<Review> reviews;

    @Builder
    public Client(Long id, String login, String password, String name, String email, String bankCard) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.bankCard = bankCard;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
