package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class SkillCategory {
    @Id
    private long id;
    @Column
    private String categoryName;
    private String description;
    private boolean active;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}
