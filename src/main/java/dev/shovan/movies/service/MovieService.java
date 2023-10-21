package dev.shovan.movies.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.shovan.movies.model.Movie;
import dev.shovan.movies.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public List<Movie> getAllMovies() {

        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId) {

        return movieRepository.findMovieByImdbId(imdbId);
    }
}
