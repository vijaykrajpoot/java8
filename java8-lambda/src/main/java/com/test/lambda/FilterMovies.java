package com.test.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMovies {
	public <T> List<T> filterMovies(List<T> list, Predicate<T> predicate) {
		List<T> m = new ArrayList<T>();
		for (T e : list) {
			System.out.println(predicate.test(e));
			if (predicate.test(e)) {
				m.add(e);
			}
		}
		return m;
	}
}
