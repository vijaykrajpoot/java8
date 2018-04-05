package com.test.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java8.movies.model.Movie;
import com.java8.movies.model.MoviePredicate;

public class FilterMovies {
	public <T> List<T> filterMovies(List<T> list, Predicate<T> predicate) {
		List<T> m = new ArrayList<T>();
		for (T e : list) {
			if (predicate.test(e)) {
				m.add(e);
			}
		}
		return m;
	}
}
