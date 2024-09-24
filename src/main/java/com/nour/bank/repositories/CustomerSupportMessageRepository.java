package com.nour.bank.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nour.bank.entities.CustomerSupportMessage;
import com.nour.bank.entities.User;

@Repository
public interface CustomerSupportMessageRepository extends JpaRepository<CustomerSupportMessage, Long> {
    List<CustomerSupportMessage> findByUser(User user);
}
