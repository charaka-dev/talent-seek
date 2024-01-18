package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer no;
    String name;
    String email;
}
