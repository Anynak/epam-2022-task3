package com.company.model.dancePerformance;

import com.company.model.dancePerformance.dancer.Dancer;

import java.util.ArrayList;
import java.util.Objects;

public class DancePerformance {

    private int number;
    private Type type;
    private Scene scene;
    private NumberOfDancers numberOfDancers;
    private Music music;
    private ArrayList<Dancer> dancers;


    public DancePerformance() {

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
        return "\n" + "DancePerformance{" +
                "number=" + getNumber() +
                ", type=" + getType() +
                ", scene=" + getScene() +
                ", numberOfDancers=" + getNumberOfDancers() +
                ", music=" + getMusic() +
                ", dancers=" + getDancers() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DancePerformance that = (DancePerformance) o;

        if (number != that.number) return false;
        if (type != that.type) return false;
        if (scene != that.scene) return false;
        if (numberOfDancers != that.numberOfDancers) return false;
        if (music != that.music) return false;
        return Objects.equals(dancers, that.dancers);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (scene != null ? scene.hashCode() : 0);
        result = 31 * result + (numberOfDancers != null ? numberOfDancers.hashCode() : 0);
        result = 31 * result + (music != null ? music.hashCode() : 0);
        result = 31 * result + (dancers != null ? dancers.hashCode() : 0);
        return result;
    }
}
