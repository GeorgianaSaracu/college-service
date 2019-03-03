package org.fasttrackit.collegeservice.web;

import org.fasttrackit.collegeservice.dto.EditStudentDTO;
import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.service.CollegeService;
import org.fasttrackit.collegeservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;


    @CrossOrigin
    @RequestMapping(path = "/collegeMajor/student", method = RequestMethod.PUT)
    @ResponseBody
    public void editStudent(@RequestBody EditStudentDTO request) {
        studentService.addStudentToMajor(request.getStudentId(), request.getMajorId());
    }

    @RequestMapping(path = "college/{collegeId}/collegeMajor/{collegeMajorId}/student", method = RequestMethod.POST)
    @ResponseBody
    public StudentDTO saveStudent(@PathVariable long collegeId,@PathVariable long collegeMajorId,
                                  @RequestBody StudentDTO request) {

        studentService.create(request, collegeId, collegeMajorId);
        return request;
    }


}


