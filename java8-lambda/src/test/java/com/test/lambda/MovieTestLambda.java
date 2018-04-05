package com.test.lambda;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.java8.movies.model.GenreEnum;
import com.java8.movies.model.Movie;

@RunWith(PowerMockRunner.class)
public class MovieTestLambda {

	@Test
	public void testLambda(){
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
		
		List<Movie> horrorMovies = filterMovies.filterMovies(movies,(Movie movie)->GenreEnum.Horror.equals(movie.getGenre())  );
		Assert.assertEquals(3,horrorMovies.size());
	}
}
