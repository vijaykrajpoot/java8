package com.test.predicates;

import com.java8.movies.model.GenreEnum;
import com.java8.movies.model.Movie;
import com.java8.movies.model.MoviePredicate;

public class AdventurePredicateGenre implements MoviePredicate {

	@Override
	public boolean test(Movie movie) {
		// TODO Auto-generated method stub
		return GenreEnum.Adventure==movie.getGenre();
	}

}
