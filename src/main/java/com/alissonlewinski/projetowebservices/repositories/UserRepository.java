package com.alissonlewinski.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonlewinski.projetowebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
