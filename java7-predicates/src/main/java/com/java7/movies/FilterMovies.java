package com.java7.movies;

import java.util.ArrayList;
import java.util.List;

import com.java7.movies.model.Movie;
import com.java7.movies.model.MoviePredicate;


public class FilterMovies {
	public  List<Movie> filterMovies(List<Movie> movies, MoviePredicate moviePredicate) {
		List<Movie> m = new ArrayList<Movie>();
		for (Movie movie : movies) {
			if (moviePredicate.test(movie)) {
				m.add(movie);
			}
		}
		return m;
	}


	public static void main(String[] args) {
		
	}
	
}
