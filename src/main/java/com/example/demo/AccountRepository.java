package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
//import javax.persistence.Id;
public interface AccountRepository extends JpaRepository<Account, Long> {
    // You can add custom queries here if needed
}
