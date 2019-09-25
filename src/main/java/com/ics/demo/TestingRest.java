package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
        // Rest Template Way

//        RestTemplate restTemplate = new RestTemplate();
//
//        ResponseEntity<List<Movie>> response = restTemplate.exchange(
//                "http://10.51.10.111:9090/movies",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Movie>>() {});
//        List<Movie> movies = response.getBody();
//        System.out.println(movies.toString());
//
//        Movie movie = restTemplate.getForObject("http://10.51.10.111:9090/movies/4", Movie.class);
//
//        System.err.println(movie.toString());
//
//        String url = "http://10.51.10.111:9090/movies/search?name="+movie.getName() ;
//        Movie movieByName = restTemplate.getForObject(
//                url,
//                Movie.class);
//        System.err.println(movieByName.toString());
//
        /*
        * Feign Client way
        * */
//        Movie newMovie = new Movie("Annabelle", "2019");
//        newMovie = feignRestClient.createMovie(newMovie);
//
//        System.out.println("Created movie:" + newMovie.toString());
//        movies = feignRestClient.getAllMovies();
//        System.err.println(movies.toString());
//
//        newMovie.setName("what it do babyyyy");
//        feignRestClient.updateMovie(newMovie.getId(), newMovie);

        /*
         * Mock- CAT
         * */
//        Student newStudent = new Student("94233","Brian");
//        newStudent = feignRestClient.registerStudent(newStudent);
//        System.out.println("Created Student:" + newStudent.toString());

//        List<Teacher> teachers = feignRestClient.getAllTeachers();
//        System.out.println(teachers.toString());

//        Student student = feignRestClient.findStudentById((long) 5);
//        System.out.println(student.toString());
////
//        Appointment newAppointment = new Appointment(5,3);
//        newAppointment = feignRestClient.createAppointment(newAppointment);
//        System.out.println("Created Appointment" + newAppointment);

//        feignRestClient.confirmAppointment((long)9, (long)5);

        /*
        CAT
         */

//        Student newStudent = feignRestClient.registerStudent(new Student("94233", "Brian"));
//        System.out.println("Created Student:" + newStudent.toString());

        Attachment attachments = feignRestClient.requestAttachment(6,27);
        System.out.println("Attachment:" + attachments);



    }
}
