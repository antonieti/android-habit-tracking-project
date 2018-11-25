package br.edu.ifsp.cmp.entities;

public class Habit {

    private Long id;
    private String name;
    private Short progressCount;
    private Short goalCount;

    private Habit(Long id, String name, Short goalCount) {
        this.id = id;
        this.name = name;
        this.goalCount = goalCount;
        this.progressCount = 0;
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

    public Short getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(Short goalCount) {
        this.goalCount = goalCount;
    }

    public void incrementProgressCount(){
        this.progressCount++;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private Short goalCount;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder goalCount(Short goalCount) {
            this.goalCount = goalCount;
            return this;
        }

        public Habit build() {
            return new Habit(this.id, this.name, this.goalCount);
        }
    }
}