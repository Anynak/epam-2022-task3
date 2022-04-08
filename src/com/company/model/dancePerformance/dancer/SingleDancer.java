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
        return "SingleDancer{" +
                "id=" + super.getId() +
                ", name=" + super.getName() +
                ", age=" + getAge() +
                ", yearsOfExperience=" + getYearsOfExperience() +
                '}';
    }
}
