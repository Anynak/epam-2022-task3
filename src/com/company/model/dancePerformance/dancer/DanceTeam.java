package com.company.model.dancePerformance.dancer;

public class DanceTeam extends Dancer{
    private int yearOfCreation;
    private String bossName;

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    @Override
    public String toString() {
        return "DanceTeam{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", yearOfCreation=" + getYearOfCreation() +
                ", bossName='" + getBossName() + '\'' +
                '}';
    }
}
