package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.fasttrackit.collegeservice.model.Student;

import java.util.ArrayList;
import java.util.List;


public class ConvertorUtils {

    public static CollegeDTO convertToDto(CollegeMajor one) {
        CollegeDTO dto = new CollegeDTO();
        dto.setId(one.getId());
        dto.setName(one.getName());
        dto.setAvailableSpots(one.getAvailableSpots());
        dto.setMajor(one.getMajor());
        List<StudentDTO> studentsDto = new ArrayList<>();
        /*for (Student c : one.getStudents()) {
            StudentDTO cd = convertToDto(c);
            studentsDto.add(cd);
        }*/
        //dto.setStudents(studentsDto);
        return dto;
    }

    public static StudentDTO convertToDto(Student c) {
        StudentDTO cd = new StudentDTO();
        cd.setFirstName(c.getFirstName());
        cd.setLastName(c.getLastName());
        cd.setId(c.getId());
        return cd;
    }
}
