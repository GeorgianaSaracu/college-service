package org.fasttrackit.collegeservice.web;

import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.service.CollegeService;
import org.fasttrackit.collegeservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {


    @Autowired
    private CollegeService service;
    @Autowired
    private StudentService studentService;


    @CrossOrigin
    @RequestMapping(path = "/collegeMajor/{collegeMajorId}/student/{studentId}", method = RequestMethod.PUT)
    @ResponseBody
    public StudentDTO editStudent(@PathVariable long collegeMajorId, @PathVariable long studentId,
                                  @RequestBody StudentDTO request) {
        request.setId(studentId);
        studentService.update(request);
        return request;
    }

    @RequestMapping(path = "/collegeMajor/{collegeMajorId}/student", method = RequestMethod.POST)
    @ResponseBody
    public StudentDTO saveStudent(@PathVariable long collegeMajorId,
                                  @RequestBody StudentDTO request) {

        studentService.create(request, collegeMajorId);
        return request;
    }

}


