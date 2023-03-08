package com.educandoweb.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
