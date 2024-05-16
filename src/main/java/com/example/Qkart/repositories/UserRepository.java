package com.example.Qkart.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.Qkart.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}