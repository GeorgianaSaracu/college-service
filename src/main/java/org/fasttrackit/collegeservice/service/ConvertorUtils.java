package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.dto.CollegeMajorDTO;
import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.model.College;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.fasttrackit.collegeservice.model.Student;

import java.util.ArrayList;
import java.util.List;


public class ConvertorUtils {

    public static CollegeMajorDTO convertToDto(CollegeMajor one) {
        CollegeMajorDTO dto = new CollegeMajorDTO();
        dto.setId(one.getId());
        dto.setName(one.getName());
        dto.setAvailableSpots(one.getAvailableSpots());
        dto.setMajor(one.getMajor());
        List<StudentDTO> studentsDto = new ArrayList<>();
        for (Student c : one.getStudents()) {
            StudentDTO cd = convertToDto(c);
            studentsDto.add(cd);
        }
        dto.setStudents(studentsDto);
        return dto;
    }


    public static CollegeDTO convertToDto(College one) {
        CollegeDTO dto = new CollegeDTO();
        dto.setId(one.getId());
        dto.setName(one.getName());
        List<StudentDTO> studentsDto = new ArrayList<>();
        for (Student c : one.getStudents()) {
            StudentDTO cd = convertToDto(c);
            studentsDto.add(cd);
        }
        dto.setStudents(studentsDto);

        List<CollegeMajorDTO> majorsDtos = new ArrayList<>();
        for (CollegeMajor c : one.getCollegeMajors()) {
            CollegeMajorDTO cd = convertToDto(c);
            majorsDtos.add(cd);
        }
        dto.setCollegeMajors(majorsDtos);

        return dto;
    }

    public static StudentDTO convertToDto(Student c) {
        StudentDTO cd = new StudentDTO();
        cd.setFirstName(c.getFirstName());
        cd.setLastName(c.getLastName());
        cd.setId(c.getId());
        return cd;
    }


    public static CollegeMajor convert(CollegeMajorDTO one) {
        CollegeMajor dto = new CollegeMajor();
        dto.setId(one.getId());
        dto.setName(one.getName());
        dto.setAvailableSpots(one.getAvailableSpots());
        dto.setMajor(one.getMajor());
        List<Student> studentsDto = new ArrayList<>();
        for (StudentDTO c : one.getStudents()) {
            Student cd = convert(c);
            studentsDto.add(cd);
        }
        dto.setStudents(studentsDto);
        return dto;
    }


    public static College convert(CollegeDTO one) {
        College dto = new College();
        dto.setId(one.getId());
        dto.setName(one.getName());
        List<Student> studentsDto = new ArrayList<>();
        for (StudentDTO c : one.getStudents()) {
            Student cd = convert(c);
            studentsDto.add(cd);
        }
        dto.setStudents(studentsDto);

        List<CollegeMajor> majorsDtos = new ArrayList<>();
        for (CollegeMajorDTO c : one.getCollegeMajors()) {
            CollegeMajor cd = convert(c);
            majorsDtos.add(cd);
        }
        dto.setCollegeMajors(majorsDtos);

        return dto;
    }

    public static Student convert(StudentDTO c) {
        Student cd = new Student();
        cd.setFirstName(c.getFirstName());
        cd.setLastName(c.getLastName());
        cd.setId(c.getId());
        return cd;
    }
}
