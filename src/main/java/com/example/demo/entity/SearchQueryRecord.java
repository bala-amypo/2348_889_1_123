package com.example.demo.Entity;

import java.time.LocalDate;

import jakarta.persistence.Id;

public class Searchqueryrecord {
    @Id
    private long id;
    private long searcherld;
    private String skillsRequested;
    private int resultsCount;
    private LocalDate searchedAt;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getSearcherld() {
        return searcherld;
    }
    public void setSearcherld(long searcherld) {
        this.searcherld = searcherld;
    }
    public String getSkillsRequested() {
        return skillsRequested;
    }
    public void setSkillsRequested(String skillsRequested) {
        this.skillsRequested = skillsRequested;
    }
    public int getResultsCount() {
        return resultsCount;
    }
    public void setResultsCount(int resultsCount) {
        this.resultsCount = resultsCount;
    }
    public LocalDate getSearchedAt() {
        return searchedAt;
    }
    public void setSearchedAt(LocalDate searchedAt) {
        this.searchedAt = searchedAt;
    }
}
