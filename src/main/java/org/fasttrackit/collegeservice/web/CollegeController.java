package org.fasttrackit.collegeservice.web;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CollegeController {


    @Autowired
    private CollegeService service;

    @RequestMapping(path = "/collegeMajor", method = RequestMethod.GET)
    @ResponseBody
    public List<CollegeDTO> getCollegeMajors() {
        return service.getAllCollegeMajors();
    }

}


