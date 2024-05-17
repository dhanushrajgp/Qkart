package com.example.Qkart.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.Qkart.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer
        > {
    Optional<User> findByEmail(String email);
}