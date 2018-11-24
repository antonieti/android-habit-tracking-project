package com.companyname.habittracking.entities;

public class Task {

    private Long id;
    private String name;
    private Boolean finished;

    private Task(Long id, String name, Boolean finished) {
        this.id = id;
        this.name = name;
        this.finished = finished;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isFinished() {
        return finished;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private Boolean finished;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder finished(Boolean finished) {
            this.finished = finished;
            return this;
        }

        public Task build() {
            return new Task(this.id, this.name, this.finished);
        }
    }
}