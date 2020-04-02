package com.java8.movies.business;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        EasyRandomParameters parameters = new EasyRandomParameters()
                .seed(123L)
                .objectPoolSize(100)
                .randomizationDepth(3)
                .stringLengthRange(5, 10)
                .collectionSizeRange(2, 4)
                .ignoreRandomizationErrors(true);
        EasyRandom easyRandom = new EasyRandom(parameters);
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

        // Filter Adventure Movies
        filteredMovies = movies
                .stream()
                .sorted((o1, o2) -> o1.getGenre().name().compareTo(o2.getGenre().name()))
                .collect(Collectors.toList());
//        System.out.println("Sorted Movies:");
//        filteredMovies.forEach(movie -> {
//            System.out.println(movie.getGenre() +":"+ movie.getTitle());
//        });

        // Mapped All movies based on Gener
        /**
         *  Horror = movie1,movie2,movie3,movie4,movie5,movie6
         *  Action = movie8,movie10,movie43,movie12,movie59,movie60
         *
         */
        System.out.println("$$$$$$$$$$$$$$$$$$Mapped All movies based on Genre");
        Map<GenreEnum, List<Movie>> filteredAllGenreMovies = movies
                .stream()
                // Sorted
                // Method-1
                //.sorted((o1, o2) -> o1.getGenre().name().compareTo(o2.getGenre().name()))
                // Method-2
                //.sorted((o1, o2) -> { return o1.getGenre().name().compareTo(o2.getGenre().name()); })
                // Method-3
                .sorted(Comparator.comparing(o -> o.getGenre().name()))
                // Collect movies by their Genre
                .collect(Collectors.groupingBy(Movie::getGenre, LinkedHashMap::new, Collectors.toList()));
        // Get each genre and their corresponding moviesList
        filteredAllGenreMovies.forEach((genre, moviesList) -> {
            System.out.println(genre.name() + ":" + moviesList.size());
        });

        List<Movie> horrorMovie = filteredAllGenreMovies.get(GenreEnum.Horror);
        if (horrorMovie!= null) {
            horrorMovie.forEach(movie -> {
                System.out.println(movie.getGenre() +"-"+  movie);
            });
        }
    }
}

