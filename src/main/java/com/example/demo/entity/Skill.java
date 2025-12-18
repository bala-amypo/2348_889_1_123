package com.example.demo.entity;

public class Skill {
    @Id
    private Long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    private String department;
    private String jobTitle;
    private boolean active;
    
}