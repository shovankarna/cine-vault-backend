package dev.shovan.movies.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.shovan.movies.model.Movie;
import java.util.List;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    
    Optional<Movie> findMovieByImdbId(String imdbId);
}
