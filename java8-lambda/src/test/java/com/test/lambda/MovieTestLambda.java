package com.test.lambda;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.java8.movies.model.GenreEnum;
import com.java8.movies.model.Movie;

@RunWith(PowerMockRunner.class)
public class MovieTestLambda {

	@Test
	public void testLambdaExpHorrorMovies(){
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
	

	@Test
	public void testLambdaExpFamily(){
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
		List<Movie> horrorMovies = filterMovies.filterMovies(movies,(Movie movie)->GenreEnum.Family.equals(movie.getGenre())  );
		Assert.assertEquals(0,horrorMovies.size());
	}
	
	
	@Test
	public void testLambdaHorrorAndAdventure(){
		FilterMovies filterMovies =new FilterMovies(); 
		Movie horrorMovie1 = mock(Movie.class);
		Movie horrorMovie2 = mock(Movie.class);
		Movie horrorMovie3 = mock(Movie.class);
		Movie adventureMovie1 = mock(Movie.class);
		Movie adventureMovie2 = mock(Movie.class);
		Movie adventureMovie3 = mock(Movie.class);
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(horrorMovie1);
		movies.add(horrorMovie2);
		movies.add(horrorMovie3);
		movies.add(adventureMovie1);
		movies.add(adventureMovie2);
		movies.add(adventureMovie3);
		
		when(horrorMovie1.getGenre()).thenReturn(GenreEnum.Horror);
		when(horrorMovie2.getGenre()).thenReturn(GenreEnum.Horror);
		when(horrorMovie3.getGenre()).thenReturn(GenreEnum.Horror);
		when(adventureMovie1.getGenre()).thenReturn(GenreEnum.Adventure);
		when(adventureMovie2.getGenre()).thenReturn(GenreEnum.Adventure);
		when(adventureMovie3.getGenre()).thenReturn(GenreEnum.Adventure);
		
		Predicate<Movie> familyGenerPredicate=(Movie m)->(GenreEnum.Horror).equals(m.getGenre());
		Predicate<Movie> adventureGenerPredicate=(Movie m)->(GenreEnum.Adventure).equals(m.getGenre());
		Predicate<Movie> adventureGenerPredicate1=familyGenerPredicate.or(adventureGenerPredicate);
		
		List<Movie> horrorMovies = filterMovies.filterMovies(movies,(Movie movie)->(adventureGenerPredicate1.test(movie)));
		Assert.assertEquals(6,horrorMovies.size());
	}
	
	
}
