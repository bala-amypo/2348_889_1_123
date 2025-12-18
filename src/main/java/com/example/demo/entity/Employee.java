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
    private localDate createdAt;
    private localDate updatedAt;
    public Long getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartment() {
        return department;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public boolean isActive() {
        return active;
    }
    public localDate getCreatedAt() {
        return createdAt;
    }
    public localDate getUpdatedAt() {
        return updatedAt;
    }
}