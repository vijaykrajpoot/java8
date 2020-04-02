package com.java8.movies.business;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Instant st1 = Instant.now();
        List<Movie> movies=generateMovies(5000000);
        Instant fn1 = Instant.now();
        long te1 = Duration.between(st1, fn1).toMillis();  //in millis
        System.out.println("Movie Population Time :"+te1);
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
                .parallelStream()
                .sorted(Comparator.comparing(movie -> movie.getGenre().name()))
                .collect(Collectors.toList());
        System.out.println("Sorted Movies:");
       // filteredMovies.forEach(movie -> System.out.println(movie.getGenre() +":"+ movie.getTitle()));

        // Mapped All movies based on Gener
        //
        //  Horror = movie1,movie2,movie3,movie4,movie5,movie6
        //  Action = movie8,movie10,movie43,movie12,movie59,movie60
        //
        //

        System.out.println("$$$$$$$$$$$$$$$$$$ Mapped/GroupBy All movies based on Genre");
        Instant start = Instant.now();
        Map<GenreEnum, List<Movie>> filteredAllGenreMovies = movies
                .parallelStream()
                // Sorted
                // Method-1
                //.sorted((o1, o2) -> o1.getGenre().name().compareTo(o2.getGenre().name()))
                // Method-2
                //.sorted((o1, o2) -> { return o1.getGenre().name().compareTo(o2.getGenre().name()); })
                // Method-3
                //.sorted(Comparator.comparing(o -> o.getGenre().name()))
                // Collect movies by their Genre
                // to maintained the insertion order using LinkedHashMap but list of movies must be sorted.
                // else use TreeMap
                //.collect(Collectors.groupingBy(Movie::getGenre, LinkedHashMap::new, Collectors.toList()));
                .collect(Collectors.groupingBy(Movie::getGenre, TreeMap::new, Collectors.toList()));
        // Get each genre and their corresponding moviesList
        filteredAllGenreMovies.forEach((genre, moviesList) -> System.out.println(genre.name() + ":" + moviesList.size()));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
        System.out.println("Time Elapsed:"+ timeElapsed);
        List<Movie> horrorMovie = filteredAllGenreMovies.get(GenreEnum.Horror);
        if (horrorMovie!= null) {
        //    horrorMovie.forEach(movie -> System.out.println(movie.getGenre() +"-"+  movie));
        }
    }

    private static List<Movie> generateMovies(int numberOfMovies){
        // https://github.com/j-easy/easy-random/
        EasyRandomParameters parameters = new EasyRandomParameters()
                .seed(123L)
                .objectPoolSize(100)
                .randomizationDepth(3)
                .stringLengthRange(5, 10)
                .collectionSizeRange(2, 4)
                .ignoreRandomizationErrors(true);
        EasyRandom easyRandom = new EasyRandom(parameters);
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < numberOfMovies; i++)
            movies.add(easyRandom.nextObject(Movie.class));
        return movies;

    }
}

