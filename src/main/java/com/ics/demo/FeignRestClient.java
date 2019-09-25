package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="brian", url="http://10.51.10.111:2000", configuration = FeignConfiguration.class)
public interface FeignRestClient {

//    @RequestMapping(method = RequestMethod.GET, value = "movies")
//    List<Movie> getAllMovies();
//
//    @RequestMapping(method = RequestMethod.GET, value = "movie/{id}")
//    Movie findById(@PathVariable(name = "id") Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value = "movies")
//    Movie createMovie(@RequestBody Movie movie);
//
//    @RequestMapping(method = RequestMethod.PATCH, value = "movies/{id}")
//    Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie newMovie);

    /*
    * Mock- CAT
    * */

//    @RequestMapping(method = RequestMethod.POST, value = "students")
//    Student registerStudent(@RequestBody Student student);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
//    Student findStudentById(@PathVariable(name = "id") Long id);
//
//    @RequestMapping(method = RequestMethod.GET, value = "lecturers")
//    List<Teacher> getAllTeachers();
//
//    @RequestMapping(method = RequestMethod.POST, value = "appointments")
//    Appointment createAppointment(@RequestBody Appointment appointment);
//
//    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
//    Appointment confirmAppointment(@PathVariable(name = "appointmentId")Long id, @RequestParam(name = "studentId")Long studentId);
//
    /*
    CAT
     */

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment requestAttachment(@PathVariable int companyId, @RequestParam(name = "studentId")Integer studentId);

    @RequestMapping(method = RequestMethod.PATCH, value = "companies/{companyId}/attachments")
    Attachment requestDepartment(@PathVariable(name = "companyId")int companyId,
                                 @RequestParam(name = "studentId")Integer studentId,
                                 @RequestParam(name = "departmentId") Integer departmentId);

    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
    Attachment deleteDepartment(Department department);

}
