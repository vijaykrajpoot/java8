package com.test.java8.predicate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.java8.movies.FilterMovies;
import com.java8.movies.model.GenreEnum;
import com.java8.movies.model.Movie;
import com.test.predicates.FamilyPredicateGenre;
import com.test.predicates.HistoryPredicateGenre;
import com.test.predicates.HorrorPredicateGenre;

@RunWith(PowerMockRunner.class)
public class TestMoviesPredicates {
	

	@Test
	public void testHorrorGenreMoviesPredicate() {
		FilterMovies filterMovies =new FilterMovies(); 
		Movie horrorMovie1 = mock(Movie.class);
		Movie horrorMovie2 = mock(Movie.class);
		Movie horrorMovie3 = mock(Movie.class);
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(horrorMovie1);
		movies.add(horrorMovie2);
		movies.add(horrorMovie3);
		when(horrorMovie1.getGenre()).thenReturn(GenreEnum.Horror);
		when(horrorMovie2.getGenre()).thenReturn(GenreEnum.Horror);
		when(horrorMovie3.getGenre()).thenReturn(GenreEnum.Horror);
		List<Movie> horrorMovies = filterMovies.filterMovies(movies, new HorrorPredicateGenre());
		Assert.assertNotNull(horrorMovies);
		Assert.assertTrue(horrorMovies.size() == 3);
	}

	@Test
	public void testHistoryGenreMoviesPredicate() {
		FilterMovies filterMovies =new FilterMovies(); 
		Movie historyMovie1 = mock(Movie.class);
		Movie historyMovie2 = mock(Movie.class);
		List<Movie> movies = new ArrayList<Movie>();

		movies.add(historyMovie1);
		movies.add(historyMovie2);

		when(historyMovie1.getGenre()).thenReturn(GenreEnum.History);
		when(historyMovie2.getGenre()).thenReturn(GenreEnum.History);

		List<Movie> historyMovies =  filterMovies.filterMovies(movies, new HistoryPredicateGenre());
		Assert.assertTrue(historyMovies.size() == 2);
	}
	
	
	@Test
	public void testFamilyGenreMoviesPredicate() {
		FilterMovies filterMovies =new FilterMovies(); 
		Movie historyMovie1 = mock(Movie.class);
		Movie historyMovie2 = mock(Movie.class);
		List<Movie> movies = new ArrayList<Movie>();

		movies.add(historyMovie1);
		movies.add(historyMovie2);

		when(historyMovie1.getGenre()).thenReturn(GenreEnum.Family);
		when(historyMovie2.getGenre()).thenReturn(GenreEnum.Family);

		List<Movie> historyMovies =  filterMovies.filterMovies(movies, new FamilyPredicateGenre());
		Assert.assertTrue(historyMovies.size() == 2);
	}

	
	

}
