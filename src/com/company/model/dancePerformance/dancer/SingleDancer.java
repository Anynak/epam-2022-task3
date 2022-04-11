package com.company.model.dancePerformance.dancer;

public class SingleDancer extends Dancer {
    private int age;
    private int yearsOfExperience;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "\n"+"SingleDancer{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", age=" + getAge() +
                ", yearsOfExperience=" + getYearsOfExperience() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SingleDancer that = (SingleDancer) o;

        if (age != that.age) return false;
        return yearsOfExperience == that.yearsOfExperience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + age;
        result = 31 * result + yearsOfExperience;
        return result;
    }
}
