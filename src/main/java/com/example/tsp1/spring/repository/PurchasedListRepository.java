package com.example.tsp1.spring.repository;

import com.example.tsp1.domain.PurchasedList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasedListRepository extends JpaRepository<PurchasedList,Long> {
}
