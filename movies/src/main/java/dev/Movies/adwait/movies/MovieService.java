package dev.Movies.adwait.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private  MovieRepository movieRepository;

    @Autowired
    private  ReviewRepository reviewRepository;
    public List<Movie> allMovies() {

        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        Optional<Movie> x =  movieRepository.findMovieByImdbId(imdbId);
//        System.out.println(x);
        return  x ;
    }
}

