package com.company.model.dancePerformance.dancer;

import java.util.Objects;

public class DanceTeam extends Dancer {
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
        return "\n" + "DanceTeam{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", yearOfCreation=" + getYearOfCreation() +
                ", bossName='" + getBossName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DanceTeam danceTeam = (DanceTeam) o;

        if (yearOfCreation != danceTeam.yearOfCreation) return false;
        return Objects.equals(bossName, danceTeam.bossName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + yearOfCreation;
        result = 31 * result + (bossName != null ? bossName.hashCode() : 0);
        return result;
    }
}
