package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.model.College;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.fasttrackit.collegeservice.model.Student;
import org.fasttrackit.collegeservice.repo.CollegeMajorRepository;
import org.fasttrackit.collegeservice.repo.CollegeRepository;
import org.fasttrackit.collegeservice.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService {
    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private CollegeMajorRepository collegeMajorRepository;
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
    public void create(StudentDTO student, long collegeId, long collegeMajorId) {

        College college = collegeRepository.findOne(collegeId);
        Student one = new Student();
        one.setFirstName(student.getFirstName());
        one.setLastName(student.getLastName());
        one.setAverageScore(student.getAverageScore());
        one.setMajorOption(student.getMajorOption());
        CollegeMajor collegeMajor = collegeMajorRepository.findOne(collegeMajorId);
        college.getStudents().add(one);
        collegeMajor.getStudents().add(one);
        collegeRepository.save(college);
    }


    @Transactional
    public void addStudentToMajor(long studentId, long collegeMajorId) {
        Student one = studentRepository.findOne(studentId);
        CollegeMajor collegeMajor = collegeMajorRepository.findOne(collegeMajorId);
        collegeMajor.getStudents().add(one);
        collegeMajorRepository.save(collegeMajor);

    }

}
