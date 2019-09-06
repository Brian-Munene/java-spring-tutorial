package com.ics.demo;

import com.ics.demo.models.Actor;
import com.ics.demo.models.Movie;
import com.ics.demo.repositories.ActorRepository;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dummy implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ActorRepository actorRepository;

    public Dummy(MovieRepository movieRepository, ActorRepository actorRepository) {
        this.movieRepository = movieRepository;
        this.actorRepository = actorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie("Bad Boys for life", "2020");

        Movie movie2 = new Movie("The Exorcist", "2017");

          Actor actor = new Actor("Will Smith");

          Actor actor2 = new Actor("Martin Lawrence");

        movieRepository.save(movie);
        movieRepository.save(movie2);

        actorRepository.save(actor);
        actorRepository.save(actor2);
    }
}
