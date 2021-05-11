package com.test.java7.predicate;

import com.java7.movies.FilterMovies;
import com.java7.movies.model.GenreEnum;
import com.java7.movies.model.Movie;
import com.java7.movies.predicates.FamilyPredicateGenre;
import com.java7.movies.predicates.HistoryPredicateGenre;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

public class TestMoviesPredicatesBehaviorPattern {

    @Test
    public void testHorrorGenreMoviesPredicate() {
        FilterMovies filterMovies = new FilterMovies();
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
        List<Movie> horrorMovies = filterMovies.filterMovies(movies, movie -> movie.getGenre() == GenreEnum.Horror);
        Assert.assertNotNull(horrorMovies);
        Assert.assertEquals(3, horrorMovies.size());
    }

    @Test
    public void testHistoryGenreMoviesPredicate() {
        FilterMovies filterMovies = new FilterMovies();
        Movie historyMovie1 = mock(Movie.class);
        Movie historyMovie2 = mock(Movie.class);
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(historyMovie1);
        movies.add(historyMovie2);

        when(historyMovie1.getGenre()).thenReturn(GenreEnum.History);
        when(historyMovie2.getGenre()).thenReturn(GenreEnum.History);

        List<Movie> historyMovies = filterMovies.filterMovies(movies, new HistoryPredicateGenre());
        Assert.assertEquals(2, historyMovies.size());
    }

    @Test
    public void testFamilyGenreMoviesPredicate() {
        FilterMovies filterMovies = new FilterMovies();
        Movie historyMovie1 = mock(Movie.class);
        Movie historyMovie2 = mock(Movie.class);
        List<Movie> movies = new ArrayList<Movie>();

        movies.add(historyMovie1);
        movies.add(historyMovie2);

        when(historyMovie1.getGenre()).thenReturn(GenreEnum.Family);
        when(historyMovie2.getGenre()).thenReturn(GenreEnum.Family);

        List<Movie> familyMovies = filterMovies.filterMovies(movies, new FamilyPredicateGenre());
        assertEquals(2, familyMovies.size());
        assertSame(familyMovies.get(0).getGenre(), GenreEnum.Family);
    }

}
