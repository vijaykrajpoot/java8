package com.java8.movies.business;

import org.jeasy.random.EasyRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        EasyRandom easyRandom = new EasyRandom();
        List<Movie> movies = new ArrayList<Movie>();
        for (int i = 0; i < 100; i++) {
            movies.add(easyRandom.nextObject(Movie.class));
        }

        System.out.println("Total Number of  Movies:" + movies.size());
        // Filter Horror Movies
        List<Movie> filteredMovies = movies
                .stream()
                .filter(movie -> GenreEnum.Horror.equals(movie.getGenre()))
                .collect(Collectors.toList());
        System.out.println("No Of Horror Movies:" + filteredMovies.size());

        // Filter Adventure Movies
        filteredMovies = movies
                .stream()
                .filter(movie -> GenreEnum.Adventure.equals(movie.getGenre()))
                .collect(Collectors.toList());
        System.out.println("No Of Adventure Movies:" + filteredMovies.size());

        // Mapped All movies based on Gener
        /**
         *  Horror = movie1,movie2,movie3,movie4,movie5,movie6
         *  Action = movie8,movie10,movie43,movie12,movie59,movie60
         *
         */
        System.out.println("$$$$$$$$$$$$$$$$$$Mapped All movies based on Genre");
        Map<GenreEnum, List<Movie>> filteredAllGenreMovies = movies
                .stream()
                .sorted((o1, o2) -> o2.getGenre().name().compareTo(o1.getGenre().name()))
                .collect(Collectors.groupingBy(Movie::getGenre));
        filteredAllGenreMovies.forEach((genreEnum, m) -> {
            System.out.println(genreEnum.name() + ":" + m.size());
        });

        //  System.out.println("No Of Adventure Movies:"+movies.size());
    }
}

