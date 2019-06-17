package com.java7.movies.predicates;

import com.java7.movies.model.GenreEnum;
import com.java7.movies.model.Movie;
import com.java7.movies.model.MoviePredicate;

public class SciFiPredicateGenre implements MoviePredicate {

	@Override
	public boolean test(Movie movie) {
		// TODO Auto-generated method stub
		return GenreEnum.SciFi==movie.getGenre();
	}
}
