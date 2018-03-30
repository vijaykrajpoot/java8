package com.java8.movies.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Movie {

	private String title;

	private List<String> actors;

	private GenreEnum genre;

	private LocalDate releaseDate;

	private LocalTime runningTime;

	private String director;

}
