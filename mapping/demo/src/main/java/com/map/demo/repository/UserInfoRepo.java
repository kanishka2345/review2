package com.map.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.demo.model.UserInfo;

public interface UserInfoRepo extends JpaRepository<UserInfo,Integer> {

    
}