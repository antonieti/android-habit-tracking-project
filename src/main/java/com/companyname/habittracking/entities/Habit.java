package com.companyname.habittracking.entities;

public class Habit {

    private Long id;
    private String name;
    private Short progressCount;

    private Habit(Long id, String name, Short progressCount) {
        this.id = id;
        this.name = name;
        this.progressCount = progressCount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Short getProgressCount() {
        return progressCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgressCount(Short progressCount) {
        this.progressCount = progressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private Short progressCount;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder progressCount(Short progressCount) {
            this.progressCount = progressCount;
            return this;
        }

        public Habit build() {
            return new Habit(this.id, this.name, this.progressCount);
        }
    }
}