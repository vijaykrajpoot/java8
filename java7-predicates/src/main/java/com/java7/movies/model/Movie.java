package com.java7.movies.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


public class Movie {

    private String title;

    private List<String> actors;

    private GenreEnum genre;

    private LocalDate releaseDate;

    private LocalTime runningTime;

    private String director;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalTime getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(LocalTime runningTime) {
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", actors=" + actors +
                ", genre=" + genre +
                ", releaseDate=" + releaseDate +
                ", runningTime=" + runningTime +
                ", director='" + director + '\'' +
                '}';
    }
}
