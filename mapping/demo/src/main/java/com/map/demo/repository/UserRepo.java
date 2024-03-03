package com.map.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.demo.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

    
}