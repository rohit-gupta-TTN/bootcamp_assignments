package com.bootcamp.jpa2.repositories;

import com.bootcamp.jpa2.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankAccount, Integer> {
}