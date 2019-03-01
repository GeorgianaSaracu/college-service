package org.fasttrackit.collegeservice.dto;

import java.util.ArrayList;
import java.util.List;


public class CollegeDTO {
    private Long id;
    
    private String name;

    private int major;
    private int availableSpots;
    private List<CollegeMajorDTO> collegeMajors = new ArrayList<>();

    private List<StudentDTO> students = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CollegeMajorDTO> getCollegeMajors() {
        return collegeMajors;
    }

    public void setCollegeMajors(List<CollegeMajorDTO> collegeMajors) {
        this.collegeMajors = collegeMajors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CollegeDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}
