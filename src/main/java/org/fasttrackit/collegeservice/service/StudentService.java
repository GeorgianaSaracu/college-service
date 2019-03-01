package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.model.Student;
import org.fasttrackit.collegeservice.repo.CollegeMajorRepository;
import org.fasttrackit.collegeservice.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService {

    @Autowired
    private CollegeMajorRepository collegeRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void update(StudentDTO student) {
        Student one = studentRepository.findOne(student.getId());
        if (one == null) {
            throw new IllegalArgumentException("Invalid id");

        }
        one.setFirstName(student.getFirstName());
        one.setLastName(student.getLastName());
        one.setAverageScore(student.getAverageScore());
        one.setMajorOption(student.getMajorOption());
        studentRepository.save(one);

    }

    @Transactional
    public void create(StudentDTO student, long collegeMajorId) {

        Student one = new Student();
        one.setFirstName(student.getFirstName());
        one.setLastName(student.getLastName());
        one.setAverageScore(student.getAverageScore());
        one.setMajorOption(student.getMajorOption());
        //CollegeMajor collegeMajor = collegeRepository.findById(collegeMajorId).orElse(null);
        //collegeMajor.getStudents().add(one);
        //collegeRepository.save(collegeMajor);
    }
}
