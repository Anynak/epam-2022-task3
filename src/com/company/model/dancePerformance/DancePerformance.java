package com.company.model.dancePerformance;

import com.company.model.dancePerformance.dancer.Dancer;

import java.util.ArrayList;

public class DancePerformance{

    private int number;
    private Type type;
    private Scene scene;
    private NumberOfDancers numberOfDancers;
    private Music music;
    private ArrayList<Dancer> dancers;


    public DancePerformance(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public NumberOfDancers getNumberOfDancers() {
        return numberOfDancers;
    }

    public void setNumberOfDancers(NumberOfDancers numberOfDancers) {
        this.numberOfDancers = numberOfDancers;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public ArrayList<Dancer> getDancers() {
        return dancers;
    }

    public void setDancers(ArrayList<Dancer> dancers) {
        this.dancers = dancers;
    }

    @Override
    public String toString() {
        return "DancePerformance{" +
                "number=" + getNumber() +
                ", type=" + getType() +
                ", scene=" + getScene() +
                ", numberOfDancers=" + getNumberOfDancers() +
                ", music=" + getMusic() +
                ", dancers=" + getDancers() +
                '}';
    }
}
