package com.map.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserInfo {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int username;
    private String password;
    private String email;
    

}